Group-10_OOP_N01   
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
## Giới thiệu dự án:    
Dự án này là một hệ thống quản lý bán hàng, giúp tối ưu hóa và cải thiện hiệu quả hoạt động của các cửa hàng. Hệ thống cho phép quản lý các sản phẩm và giao dịch    
## Thành viên nhóm:    
* Đào Quang Hiệp: vẽ UML chức năng Delete, Add, order; Code back-end, database.  
  link video demo:  
* Nguyễn Ngọc Hiếu: Thiết kế giao diện; code front-end; thiết kế Class Diagram, vẽ UML chức năng update, sign in, sign up ; viết báo cáo.    
  link video demo:
  link project:  https://github.com/hiepdaoquang704/OOP    
  link video demo:  https://youtu.be/GY9_6zcJ4EQ?si=-K-ds1Hyz6ctz2YR    
  
##  Tổng quan về Hệ Quản trị Cơ sở Dữ liệu MySQL
MySQL lưu trữ dữ liệu dưới dạng các bảng trong cơ sở dữ liệu. Mỗi bảng bao gồm các cột (column) và hàng (row). Dữ liệu trong MySQL được tổ chức và quản lý thông qua các câu truy vấn SQL, giúp người dùng có thể dễ dàng truy xuất, cập nhật, hoặc xóa dữ liệu.
Trong ứng dụng bán hàng, MySQL được sử dụng để lưu trữ và quản lý các thông tin quan trọng như:
* Thông tin sản phẩm: Tên, giá, số lượng.
* Thông tin người dùng: Tên, Email, số điện thoại,customer/manager,password.
* Đơn hàng: Thông tin các đơn hàng, sản phẩm, khách hàng và trạng thái của đơn hàng.
* MySQL giúp quản lý cơ sở dữ liệu của ứng dụng một cách hiệu quả, hỗ trợ truy xuất thông tin nhanh chóng và bảo mật.
##  Phân tích và thiết kế hệ thống
### Xác định yêu cầu
#### Yêu cầu chức năng
Yêu cầu chức năng mô tả các tính năng mà hệ thống cần phải có để phục vụ người dùng. Trong ứng dụng bán hàng, các yêu cầu chức năng cơ bản bao gồm:
  1. Đăng kí, đăng nhập tài khoản
  2.  Quản lý sản phẩm:
 * Cho phép quản trị viên thêm, xóa và cập nhật thông tin sản phẩm (tên, giá, mô tả, số lượng tồn kho).
 * Hiển thị danh sách các sản phẩm cho khách hàng.
  3. Quản lý giỏ hàng:
 * Cho phép khách hàng thêm sản phẩm vào giỏ hàng.
 * Khách hàng có thể chỉnh sửa số lượng sản phẩm trong giỏ hàng hoặc xóa sản phẩm khỏi giỏ.
  4.Quản lý đơn hàng:
 * Khách hàng có thể tạo đơn hàng từ giỏ hàng.
 * Hệ thống ghi nhận thông tin đơn hàng như tên khách hàng, địa chỉ giao hàng, danh sách sản phẩm và số lượng.
 * Hiển thị trạng thái đơn hàng (chờ xử lý, đang giao, đã hoàn thành).
  5. Tìm kiếm sản phẩm:
 * Cung cấp chức năng tìm kiếm sản phẩm theo tên, giá, danh mục sản phẩm.  
  6 .Quản lý khách hàng:
 * Quản lý thông tin khách hàng (tên, địa chỉ, số điện thoại, email).
 * Cho phép khách hàng đăng ký tài khoản, đăng nhập và quản lý thông tin cá nhân.
#### Yêu cầu hệ thống
Yêu cầu hệ thống mô tả các yêu cầu kỹ thuật và hiệu năng mà hệ thống cần đạt được để đảm bảo hoạt động ổn định và an toàn
  1. Cơ sở dữ liệu:
 * Hệ thống phải sử dụng cơ sở dữ liệu MySQL để lưu trữ thông tin sản phẩm, khách hàng, đơn hàng.
 * Cơ sở dữ liệu cần được tối ưu hóa để đảm bảo truy vấn dữ liệu nhanh chóng ngay cả khi số lượng sản phẩm và đơn hàng tăng cao.
  2. Bảo mật:
* Hệ thống cần đảm bảo an toàn dữ liệu bằng cách mã hóa thông tin khách hàng, đặc biệt là thông tin nhạy cảm như địa chỉ và số điện thoại.
Cung cấp cơ chế xác thực và phân quyền, chỉ cho phép quản trị viên truy cập vào các tính năng quản lý.
  3. Tính hiệu năng:
 * Ứng dụng phải hoạt động ổn định và đáp ứng nhanh ngay cả khi có nhiều người dùng truy cập cùng lúc.
 * Thời gian tải trang không quá 3 giây, ngay cả khi số lượng sản phẩm lớn.
### Mô hình hóa
 1. Biểu đồ  tổng quan ClassDiagram
 
![image](https://github.com/user-attachments/assets/86ee70db-c762-42c0-a679-5f6bef1b40e6)




2. Biểu đồ Sequence Diagram Đăng kí


![image](https://github.com/user-attachments/assets/1496f743-0995-4176-8beb-e0586deb8eb3)


3. Biểu đồ Sequence Diagram Đăng nhập


![image](https://github.com/user-attachments/assets/a1d58ff5-41a9-4656-9255-1737402c9122)



4. Biểu đổ Sequence Diagram Add product


![image](https://github.com/user-attachments/assets/0f216636-c9a9-4ee9-a4a1-702b103082a9)


5. Biểu đổ Sequence Diagram Delete product
   

![image](https://github.com/user-attachments/assets/2129cc1c-ec42-4ca3-99f3-4c11fd3f46f5)



6. Biểu đồ Sequence Diagram Update product


   
![image](https://github.com/user-attachments/assets/9e764e12-cdc2-4b37-a397-93fd02d64bb3)



7. Biểu đổ Sequence Diagram Orders



![image](https://github.com/user-attachments/assets/c22ef989-c79c-410c-a3be-f4886315b951)


### Các thành phần chức năng của hệ thống
#### Đăng ký, đăng nhập
1. Chức năng đăng ký:
Mô tả: Khách hàng có thể tạo tài khoản mới để sử dụng ứng dụng. Việc này giúp hệ thống lưu trữ thông tin cá nhân và quản lý đơn hàng của khách hàng dễ dàng hơn.\
Yêu cầu:
* Người dùng cần cung cấp thông tin cần thiết như tên, địa chỉ, số điện thoại và email.
* Hệ thống phải kiểm tra tính hợp lệ của thông tin (ví dụ: địa chỉ email phải đúng định dạng).
* Hệ thống cần kiểm tra xem email đã tồn tại hay chưa. Nếu có, hiển thị thông báo lỗi.
2. Chức năng đăng nhập:
Mô tả: Khách hàng có thể đăng nhập vào tài khoản đã tạo để truy cập các tính năng của ứng dụng.\
Yêu cầu:
 * Người dùng nhập địa chỉ email và mật khẩu để đăng nhập.
 * Hệ thống cần xác thực thông tin và cho phép truy cập vào các chức năng như quản lý giỏ hàng, xem đơn hàng đã đặt.
 * Nếu thông tin đăng nhập không đúng, hệ thống sẽ hiển thị thông báo lỗi.
 * Cung cấp chức năng khôi phục mật khẩu cho người dùng nếu họ quên mật khẩu.

#### Chức năng quản lí kho
Mô tả: Chức năng này dành cho quản trị viên (Manager) của hệ thống. Nó cho phép quản trị viên quản lý thông tin sản phẩm trong kho hàng của họ.\
Các yêu cầu chức năng:
1. Quản lý sản phẩm:
 * Thêm sản phẩm: Quản trị viên có thể nhập thông tin sản phẩm mới, bao gồm tên, giá, mô tả, số lượng và hình ảnh sản phẩm.
 * Cập nhật sản phẩm: Quản trị viên có thể chỉnh sửa thông tin của sản phẩm đã có trong hệ thống.
 * Xóa sản phẩm: Quản trị viên có thể xóa sản phẩm không còn bán hoặc không phù hợp.
2. Quản lý đơn hàng(Inprogress):
 * Xem danh sách đơn hàng: Quản trị viên có thể xem tất cả các đơn hàng đã được đặt, bao gồm thông tin khách hàng, sản phẩm và trạng thái đơn hàng.
 * Cập nhật trạng thái đơn hàng: Quản trị viên có thể thay đổi trạng thái của đơn hàng (chờ xử lý, đang giao, đã hoàn thành) để theo dõi tiến độ giao hàng.
#### Chức năng Orders(Inprogress)
Mô tả: Chức năng này dành cho khách hàng (Customer) của hệ thống, cho phép họ thực hiện các thao tác mua sắm và quản lý thông tin cá nhân.

### Thiết kế giao diện hệ thống
#### Sử dụng Java Swing để thiết kế giao diện cho ứng dụng
Giới thiệu về Java Swing
Java Swing là một thư viện trong Java cho phép phát triển giao diện đồ họa (GUI) với các thành phần người dùng phong phú. Swing cung cấp nhiều công cụ và tính năng hữu ích để xây dựng các ứng dụng có giao diện thân thiện và tương tác.\
Tính năng của Java Swing
 * Độc lập với nền tảng: Giao diện Swing có thể chạy trên nhiều hệ điều hành khác nhau mà không cần thay đổi mã nguồn.
 * Thành phần giao diện đa dạng: Swing cung cấp nhiều thành phần như JButton, JTextField, JLabel, JTable, JComboBox, và nhiều thành phần khác, giúp xây dựng giao diện phong phú.
 * Hỗ trợ : Swing cho phép lập trình viên dễ dàng xử lý các sự kiện người dùng như nhấp chuột, gõ phím, và tương tác với các thành phần khác.
1. Giao diện đăng kí đăng nhập

![b02a36be-abd6-4ef9-8fa9-7e57b21fa736](https://github.com/user-attachments/assets/ac95931c-11ec-46d5-ae42-bd7f10b171c5)


![c51cf603-d3fd-4010-a861-0cf5f3fedec9](https://github.com/user-attachments/assets/34320377-342d-49be-887d-45673155a9fb)






2. Giao diện Manager


![7c562a79-6e0b-4aba-902b-e3bea448f922](https://github.com/user-attachments/assets/439b1166-9e84-4583-82ad-2e68d2da661d)


3. Giao diện Orders

![image](https://github.com/user-attachments/assets/2ddc8f9c-5c4e-4dc6-a16b-8ff068347fe1)

## Tổng kết
Ứng dụng bán hàng được phát triển với mục tiêu cung cấp một nền tảng mua sắm trực tuyến thân thiện và tiện lợi cho khách hàng. Qua quá trình thiết kế và triển khai, ứng dụng đã đạt được một số kết quả như trên
### Hướng phát triển và mở rộng 
Để ứng dụng bán hàng có thể phát triển mạnh mẽ và đáp ứng được nhu cầu ngày càng cao của người dùng, cần xem xét một số hướng phát triển và mở rộng như: Tích hợp phương thức thanh toán trực tuyến,Cải thiện hệ thống khuyến mãi và giảm giá,Tính năng đánh giá và nhận xét sản phẩm,Phân tích dữ liệu khách hàng

## Cài đặt

### 1. Clone Repository
Clone repository từ GitHub về máy của bạn:
```bash
git clone https://github.com/hiepdaoquang704/OOP.git
cd OOP
java -jar OOP.jar








