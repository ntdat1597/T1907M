-- Tao DB
CREATE DATABASE bookstore;

-- 1. Tao bang sach
CREATE TABLE sach(
ma_sach nvarchar(10) NOT NULL primary key,
ten_sach nvarchar(50) NOT NULL,
tac_gia nvarchar(50) NOT NULL,
noi_dung_tom_tat nvarchar (max) NULL,
nam_xuat_ban int NOT NULL,
lan_xuat_ban int NOT NULL,
gia_ban int NOT NULL,
so_luong int NOT NULL,
loai_sach nvarchar(50)
);


-- 1.1. Tao bang Nha Xuat Ban
CREATE TABLE nha_xuat_ban(
ma_sach nvarchar(10) NOT NULL,
dia_chi_nha_xuat_ban nvarchar(200),
ten_nha_xuat_ban nvarchar(50)
);
insert into nha_xuat_ban values('B001',N'Hà Nội',N'Tri Thức');

-- 1.2.Lien ket bang (Sua doi bang TEN_BANG them vao KHOA_NGOAI TEN_KHOA REFERENCES BANG_CHINH(KHOA_CHINH))
ALTER TABLE nha_xuat_ban
ADD FOREIGN KEY (ma_sach) REFERENCES sach(ma_sach);

-- 2.Viết lệnh SQL chèn vào các bảng của CSDL các dữ liệu mẫu
insert into sach(ma_sach,ten_sach,tac_gia,noi_dung_tom_tat,nam_xuat_ban,lan_xuat_ban,gia_ban,so_luong,loai_sach) 
values('B001',N'Trí tuệ Do Thái','Eran Katz',N'Bạn có muốn biết: Người Do Thái sáng tạo ra cái gì và nguồn gốc
trí tuệ của họ xuất phát từ đâu không? Cuốn sách này sẽ dần hé lộ
những bí ẩn về sự thông thái của người Do Thái, của một dân tộc
thông tuệ với những phương pháp và kỹ thuật phát triển tầng lớp trí
thức đã được giữ kín hàng nghìn năm như một bí ẩn mật mang tính
văn hóa.',2010,1,7900,100,N'Khoa Học Xã Hội');

insert into sach(ma_sach,ten_sach,tac_gia,noi_dung_tom_tat,nam_xuat_ban,lan_xuat_ban,gia_ban,so_luong,loai_sach) 
values('B002',N'Kim Bình Mai',N'Đồng Chí x',N'Bạn Có Muốn Biết Bên Trong Câu CHuyện Không',2008,2,8000,100,N'Văn Học');

insert into sach(ma_sach,ten_sach,tac_gia,noi_dung_tom_tat,nam_xuat_ban,lan_xuat_ban,gia_ban,so_luong,loai_sach) 
values('B003',N'Toán Lớp 1',N'Đồng Chí y',N'Toán Lớp 1',2009,3,8100,100,N'Toán Học');

insert into sach(ma_sach,ten_sach,tac_gia,noi_dung_tom_tat,nam_xuat_ban,lan_xuat_ban,gia_ban,so_luong,loai_sach) 
values('B004',N'Tin Học Lớp 1',N'Đồng Chí xy',N'Tin Học Lớp 1',2010,4,8120,100,N'Tin Học');

-- 3.Liệt kê các cuốn sách có năm xuất bản từ 2008 đến nay
select * from sach where nam_xuat_ban >= 2008;


-- 4.Liệt kê 10 cuốn sách có giá bán cao nhất t
select * from sach where gia_ban > 7900;

-- 5.Tìm NHỮNG cuốn sách có TIÊU ĐỀ CHỨA từ “TIN HỌC”.
select * from sach where ten_sach like N'Tin học%';

-- 6.Liệt kê CÁC CUỐN SÁCH có TÊN BẮT ĐẦU VỚI CHỮ “T” theo THỨ TỰ GIÁ GIẢM DẦN
select * from sach where ten_sach like N'%T%' order by gia_ban desc;

-- 7.Liệt kê các cuốn sách của nhà xuất bản Tri thức
SELECT sach.*,nha_xuat_ban.ten_nha_xuat_ban
FROM sach AS sach
INNER JOIN nha_xuat_ban nha_xuat_ban
ON sach.ma_sach = nha_xuat_ban.ma_sach where nha_xuat_ban.ten_nha_xuat_ban like N'Tri Thức%';


select * from sach;
select * from nha_xuat_ban;