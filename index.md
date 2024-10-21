# Group-10_OOP_N01  

<p align="center">
  <img src="https://img.shields.io/badge/Java-ED8B00?style=for-the-badge&logo=java&logoColor=white" />
  <img src="https://img.shields.io/badge/Eclipse-2C2255?style=for-the-badge&logo=eclipse&logoColor=white" />
  <img src="https://img.shields.io/badge/MySQL-4479A1?style=for-the-badge&logo=mysql&logoColor=white" />
</p>

# Hệ Thống Quản Lý Bán Hàng

## Table of Contents
- [Giới thiệu Dự án](#giới-thiệu-dự-án)
- [Thành viên Nhóm](#thành-viên-nhóm)
- [Tổng quan về Cơ sở Dữ liệu MySQL](#tổng-quan-về-hệ-quản-trị-cơ-sở-dữ-liệu-mysql)
- [Phân tích và thiết kế hệ thống](#phân-tích-và-thiết-kế-hệ-thống)
- [Xác định yêu cầu](#xác-định-yêu-cầu)
- [Mô hình hóa](#mô-hình-hóa)
- [Các thành phần chức năng của hệ thống](#các-thành-phần-chức-năng-của-hệ-thống)
- [Thiết kế giao diện hệ thống](#thiết-kế-giao-diện-hệ-thống)
- [Tổng kết và hướng phát triển](#tổng-kết)
- [Cài đặt](#cài-đặt)

## Giới thiệu dự án    
Dự án này là một hệ thống quản lý bán hàng, giúp tối ưu hóa và cải thiện hiệu quả hoạt động của các cửa hàng. Hệ thống cho phép quản lý các sản phẩm và giao dịch.

[Link Project](https://github.com/hiepdaoquang704/OOP)  
[Link Video Demo](https://youtu.be/GY9_6zcJ4EQ?si=-K-ds1Hyz6ctz2YR)

## Thành viên nhóm    
- Đào Quang Hiệp: vẽ UML chức năng Delete, Add, Order; code back-end, database.
- Nguyễn Ngọc Hiếu: thiết kế giao diện; code front-end; thiết kế Class Diagram, vẽ UML chức năng Update, Sign In, Sign Up; viết báo cáo.

## Tổng quan về Hệ Quản trị Cơ sở Dữ liệu MySQL
MySQL lưu trữ dữ liệu dưới dạng các bảng trong cơ sở dữ liệu. Mỗi bảng bao gồm các cột (column) và hàng (row). Dữ liệu trong MySQL được tổ chức và quản lý thông qua các câu truy vấn SQL, giúp người dùng có thể dễ dàng truy xuất, cập nhật, hoặc xóa dữ liệu.

Trong ứng dụng bán hàng, MySQL được sử dụng để lưu trữ và quản lý các thông tin quan trọng như:
- Thông tin sản phẩm: Tên, giá, số lượng.
- Thông tin người dùng: Tên, email, số điện thoại, customer/manager, password.
- Đơn hàng: Thông tin các đơn hàng, sản phẩm, khách hàng và trạng thái của đơn hàng.

MySQL giúp quản lý cơ sở dữ liệu của ứng dụng một cách hiệu quả, hỗ trợ truy xuất thông tin nhanh chóng và bảo mật.

## Phân tích và thiết kế hệ thống
### Xác định yêu cầu
#### Yêu cầu chức năng
Yêu cầu chức năng mô tả các tính năng mà hệ thống cần phải có để phục vụ người dùng. Trong ứng dụng bán hàng, các yêu cầu chức năng cơ bản bao gồm:
1. Đăng kí, đăng nhập tài khoản
2. Quản lý sản phẩm:
   - Cho phép quản trị viên thêm, xóa và cập nhật thông tin sản phẩm (tên, giá, mô tả, số lượng tồn kho).
   - Hiển thị danh sách các sản phẩm cho khách hàng.
3. Quản lý giỏ hàng:
   - Cho phép khách hàng thêm sản phẩm vào giỏ hàng.
   - Khách hàng có thể chỉnh sửa số lượng sản phẩm trong giỏ hàng hoặc xóa sản phẩm khỏi giỏ.
4. Quản lý đơn hàng:
   - Khách hàng có thể tạo đơn hàng từ giỏ hàng.
   - Hệ thống ghi nhận thông tin đơn hàng như tên khách hàng, địa chỉ giao hàng, danh sách sản phẩm và số lượng.
   - Hiển thị trạng thái đơn hàng (chờ xử lý, đang giao, đã hoàn thành).
5. Tìm kiếm sản phẩm:
   - Cung cấp chức năng tìm kiếm sản phẩm theo tên, giá, danh mục sản phẩm.
6. Quản lý khách hàng:
   - Quản lý thông tin khách hàng (tên, địa chỉ, số điện thoại, email).
   - Cho phép khách hàng đăng ký tài khoản, đăng nhập và quản lý thông tin cá nhân.

#### Yêu cầu hệ thống
Yêu cầu hệ thống mô tả các yêu cầu kỹ thuật và hiệu năng mà hệ thống cần đạt được để đảm bảo hoạt động ổn định và an toàn:
1. Cơ sở dữ liệu:
   - Hệ thống phải sử dụng cơ sở dữ liệu MySQL để lưu trữ thông tin sản phẩm, khách hàng, đơn hàng.
   - Cơ sở dữ liệu cần được tối ưu hóa để đảm bảo truy vấn dữ liệu nhanh chóng ngay cả khi số lượng sản phẩm và đơn hàng tăng cao.
2. Bảo mật:
   - Hệ thống cần đảm bảo an toàn dữ liệu bằng cách mã hóa thông tin khách hàng, đặc biệt là thông tin nhạy cảm như địa chỉ và số điện thoại.
   - Cung cấp cơ chế xác thực và phân quyền, chỉ cho phép quản trị viên truy cập vào các tính năng quản lý.
3. Tính hiệu năng:
   - Ứng dụng phải hoạt động ổn định và đáp ứng nhanh ngay cả khi có nhiều người dùng truy cập cùng lúc.
   - Thời gian tải trang không quá 3 giây, ngay cả khi số lượng sản phẩm lớn.

### Mô hình hóa
1. Biểu đồ tổng quan Class Diagram
![Class Diagram](https://github.com/user-attachments/assets/86ee70db-c762-42c0-a679-5f6bef1b40e6)
2. Biểu đồ Sequence Diagram Đăng kí
![Sequence Diagram Đăng kí](https://github.com/user-attachments/assets/1496f743-0995-4176-8beb-e0586deb8eb3)
3. Biểu đồ Sequence Diagram Đăng nhập
![Sequence Diagram Đăng nhập](https://github.com/user-attachments/assets/a1d58ff5-41a9-4656-9255-1737402c9122)
4. Biểu đồ Sequence Diagram Add product
![Sequence Diagram Add product](https://github.com/user-attachments/assets/0f216636-c9a9-4ee9-a4a1-702b103082a9)
5. Biểu đồ Sequence Diagram Delete product
![Sequence Diagram Delete product](https://github.com/user-attachments/assets/2129cc1c-ec42-4ca3-99f3-4c11fd3f46f5)
6. Biểu đồ Sequence Diagram Update product
![Sequence Diagram Update product](https://github.com/user-attachments/assets/9e764e12-cdc2-4b37-a397-93fd02d64bb3)
7. Biểu đồ Sequence Diagram Orders
![Sequence Diagram Orders](https://github.com/user-attachments/assets/c22ef989-c79c-410c-a3be-f4886315b951)

### Các thành phần chức năng của hệ thống
#### Đăng ký, đăng nhập
1. Chức năng đăng ký:
   - Mô tả: Khách hàng có thể tạo tài khoản mới để sử dụng ứng dụng. Việc này giúp hệ thống lưu trữ thông tin cá nhân và quản lý đơn hàng của khách hàng dễ dàng hơn.
   - Yêu cầu:
     - Người dùng cần cung cấp thông tin cần thiết như tên, địa chỉ, số điện thoại và email.
     - Hệ thống phải kiểm tra tính hợp lệ của thông tin (ví dụ: địa chỉ email phải đúng định dạng).
     - Hệ thống cần kiểm tra xem email đã tồn tại hay chưa. Nếu có, hiển thị thông báo lỗi.

2. Chức năng đăng nhập:
   - Mô tả: Khách hàng có thể đăng nhập vào tài khoản đã tạo để truy cập các tính năng của ứng dụng.
   - Yêu cầu:
     - Người dùng nhập địa chỉ email và mật khẩu để đăng nhập.
     - Hệ thống cần xác thực thông tin và cho phép truy cập vào các chức năng như quản lý giỏ hàng, xem đơn hàng đã đặt.
     - Nếu thông tin đăng nhập không đúng, hệ thống sẽ hiển thị thông báo lỗi.
     - Cung cấp chức năng khôi phục mật khẩu cho người dùng nếu họ quên mật khẩu.

#### Chức năng quản lý kho
- Mô tả: Chức năng này dành cho quản trị viên (Manager) của hệ thống. Nó cho phép quản trị viên quản lý thông tin sản phẩm trong kho hàng của họ.
- Các yêu cầu chức năng:
  1. Quản lý sản phẩm:
     - Cho phép quản trị viên thêm sản phẩm mới vào kho hàng.
     - Cho phép quản trị viên cập nhật thông tin sản phẩm hiện có, bao gồm tên, giá, mô tả và số lượng tồn kho.
     - Cho phép quản trị viên xóa sản phẩm khỏi kho hàng khi cần thiết.
  2. Tìm kiếm và lọc sản phẩm:
     - Cho phép quản trị viên tìm kiếm sản phẩm trong kho hàng dựa trên các tiêu chí như tên, danh mục hoặc mã sản phẩm.
     - Cung cấp các bộ lọc để quản trị viên dễ dàng lọc và sắp xếp danh sách sản phẩm theo các tiêu chí như giá, số lượng tồn kho.
  3. Theo dõi số lượng tồn kho:
     - Hiển thị số lượng tồn kho hiện tại của mỗi sản phẩm để quản trị viên có thể kiểm tra và quản lý.
     - Cảnh báo khi số lượng tồn kho của một sản phẩm giảm dưới một ngưỡng nhất định để quản trị viên có thể điều chỉnh và bổ sung sản phẩm kịp thời.

#### Chức năng thêm/xóa sản phẩm vào giỏ hàng
- Mô tả: Chức năng này cho phép khách hàng thêm và xóa sản phẩm vào giỏ hàng của mình. Điều này giúp khách hàng lựa chọn và quản lý các sản phẩm mà họ muốn mua.
- Các yêu cầu chức năng:
  1. Thêm sản phẩm vào giỏ hàng:
     - Cho phép khách hàng chọn sản phẩm và thêm chúng vào giỏ hàng.
     - Hiển thị thông tin chi tiết về sản phẩm đã thêm, bao gồm tên, giá và số lượng.
     - Cập nhật tổng giá trị của giỏ hàng sau khi thêm sản phẩm.
  2. Xóa sản phẩm khỏi giỏ hàng:
     - Cho phép khách hàng xóa sản phẩm không mong muốn khỏi giỏ hàng.
     - Cập nhật tổng giá trị của giỏ hàng sau khi xóa sản phẩm.
     - Hiển thị thông báo xác nhận trước khi xóa sản phẩm để tránh xóa nhầm.
  3. Quản lý số lượng sản phẩm:
     - Cho phép khách hàng điều chỉnh số lượng sản phẩm trong giỏ hàng.
     - Cập nhật tổng giá trị của giỏ hàng dựa trên số lượng sản phẩm đã điều chỉnh.

#### Chức năng đặt hàng
- Mô tả: Chức năng này cho phép khách hàng tiến hành đặt hàng từ giỏ hàng của mình. Quá trình đặt hàng bao gồm việc xác nhận thông tin giao hàng và thanh toán.
- Các yêu cầu chức năng:
  1. Xác nhận đơn hàng:
     - Hiển thị thông tin chi tiết về giỏ hàng, bao gồm danh sách sản phẩm, số lượng và tổng giá trị.
     - Yêu cầu khách hàng xác nhận thông tin giao hàng, bao gồm tên, địa chỉ và số điện thoại.
     - Cho phép khách hàng chỉnh sửa thông tin giao hàng nếu cần thiết.
  2. Lựa chọn phương thức thanh toán:
     - Cung cấp các phương thức thanh toán như thanh toán khi nhận hàng (COD) hoặc thanh toán trực tuyến.
     - Cho phép khách hàng chọn phương thức thanh toán phù hợp.
  3. Đặt hàng:
     - Ghi nhận đơn hàng và lưu trữ thông tin đơn hàng trong cơ sở dữ liệu.
     - Gửi thông báo xác nhận đơn hàng đến khách hàng qua email hoặc tin nhắn.
     - Hiển thị thông báo thành công sau khi đơn hàng được đặt.

## Thiết kế giao diện hệ thống

1. Giao diện người dùng đăng kí
![Giao diện đăng kí](https://github.com/user-attachments/assets/874e3fd8-e925-4a4e-98b7-9983a43f63b8)
2. Giao diện người dùng đăng nhập
![Giao diện đăng nhập](https://github.com/user-attachments/assets/0d8bcada-e202-4c6f-832b-71cc80f41db1)
3. Giao diện quản lý kho hàng
![Giao diện quản lý kho hàng](https://github.com/user-attachments/assets/1d7a61b0-1540-4c50-8d33-319cd849adcb)
4. Giao diện giỏ hàng
![Giao diện giỏ hàng](https://github.com/user-attachments/assets/91b3df5a-7bc2-4e3e-a34a-fb5e2934aa88)

## Tổng kết
Dự án Hệ Thống Quản Lý Bán Hàng đã cung cấp một nền tảng giúp các cửa hàng quản lý sản phẩm và giao dịch hiệu quả hơn. Với các tính năng như quản lý sản phẩm, giỏ hàng, đơn hàng và khách hàng, hệ thống giúp tăng cường hiệu quả và tính tổ chức trong quản lý bán hàng.

## Cài đặt
1. Clone repository về máy:
   ```bash
   git clone https://github.com/hiepdaoquang704/OOP.git
