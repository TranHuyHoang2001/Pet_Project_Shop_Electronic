-- phpMyAdmin SQL Dump
-- version 5.2.0
-- https://www.phpmyadmin.net/
--
-- Máy chủ: 127.0.0.1
-- Thời gian đã tạo: Th7 18, 2022 lúc 04:23 PM
-- Phiên bản máy phục vụ: 10.4.24-MariaDB
-- Phiên bản PHP: 8.1.6

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Cơ sở dữ liệu: `supermarketđb`
--

-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `admintbl`
--

CREATE TABLE `admintbl` (
  `ID` int(10) NOT NULL,
  `ADMINNAME` varchar(20) COLLATE utf8mb4_unicode_ci NOT NULL,
  `ADMINPASS` varchar(20) COLLATE utf8mb4_unicode_ci NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Đang đổ dữ liệu cho bảng `admintbl`
--

INSERT INTO `admintbl` (`ID`, `ADMINNAME`, `ADMINPASS`) VALUES
(1, 'Trần Huy Hoàng', '123'),
(2, 'Trần Công Tuấn Anh', '123');

-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `categorytbl`
--

CREATE TABLE `categorytbl` (
  `CATID` int(10) NOT NULL,
  `CATNAME` varchar(10) COLLATE utf8mb4_unicode_ci NOT NULL,
  `CATDESC` varchar(20) COLLATE utf8mb4_unicode_ci NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Đang đổ dữ liệu cho bảng `categorytbl`
--

INSERT INTO `categorytbl` (`CATID`, `CATNAME`, `CATDESC`) VALUES
(1, 'Điện Thoại', 'Đồ Điện Tử'),
(2, 'Máy Tính', 'Đồ Điện Tử'),
(3, 'Ti Vi', 'Đồ Điện Tử'),
(4, 'Điều Hoà', 'Đồ Gia Dụng'),
(5, 'Tủ Lạnh', 'Đồ Gia Dụng');

-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `producttbl`
--

CREATE TABLE `producttbl` (
  `PRODID` int(10) NOT NULL,
  `PRODNAME` varchar(20) COLLATE utf8mb4_unicode_ci NOT NULL,
  `PRODQTY` int(10) NOT NULL,
  `PRODPRICE` int(10) NOT NULL,
  `PRODCAT` varchar(20) COLLATE utf8mb4_unicode_ci NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Đang đổ dữ liệu cho bảng `producttbl`
--

INSERT INTO `producttbl` (`PRODID`, `PRODNAME`, `PRODQTY`, `PRODPRICE`, `PRODCAT`) VALUES
(1, 'Iphone ', 11, 3000, 'Điện Thoại'),
(2, 'LapTop_Dell ', 12, 4000, 'Máy Tính'),
(3, 'TV_SamSung', 13, 4000, 'Ti Vi'),
(4, 'Panasonic', 14, 4000, 'Điều Hoà'),
(5, 'LG_Inverter', 15, 5000, 'Tủ Lạnh');

-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `sellertbl`
--

CREATE TABLE `sellertbl` (
  `SELID` int(10) NOT NULL,
  `SELNAME` varchar(15) COLLATE utf8mb4_unicode_ci NOT NULL,
  `SELPASS` varchar(15) COLLATE utf8mb4_unicode_ci NOT NULL,
  `SELGENDER` varchar(6) COLLATE utf8mb4_unicode_ci NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Đang đổ dữ liệu cho bảng `sellertbl`
--

INSERT INTO `sellertbl` (`SELID`, `SELNAME`, `SELPASS`, `SELGENDER`) VALUES
(1, 'Nguyễn Đức Anh', '123', 'Nam'),
(2, 'Phạm Văn Hiếu', '123', 'Nam'),
(3, 'Phạm Hoàng Hải', '123', 'Nam'),
(4, 'Nguyễn Thị Vân', '123', 'Nữ'),
(5, 'Nguyễn Thị Thắm', '123', 'Nữ'),
(6, 'Trần Hoài Linh', '123', 'Nam'),
(7, 'Trần Quang Huy', '123', 'Nam');

--
-- Chỉ mục cho các bảng đã đổ
--

--
-- Chỉ mục cho bảng `admintbl`
--
ALTER TABLE `admintbl`
  ADD PRIMARY KEY (`ID`);

--
-- Chỉ mục cho bảng `categorytbl`
--
ALTER TABLE `categorytbl`
  ADD PRIMARY KEY (`CATID`);

--
-- Chỉ mục cho bảng `producttbl`
--
ALTER TABLE `producttbl`
  ADD PRIMARY KEY (`PRODID`);

--
-- Chỉ mục cho bảng `sellertbl`
--
ALTER TABLE `sellertbl`
  ADD PRIMARY KEY (`SELID`);

--
-- AUTO_INCREMENT cho các bảng đã đổ
--

--
-- AUTO_INCREMENT cho bảng `admintbl`
--
ALTER TABLE `admintbl`
  MODIFY `ID` int(10) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;

--
-- AUTO_INCREMENT cho bảng `categorytbl`
--
ALTER TABLE `categorytbl`
  MODIFY `CATID` int(10) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=6;

--
-- AUTO_INCREMENT cho bảng `producttbl`
--
ALTER TABLE `producttbl`
  MODIFY `PRODID` int(10) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=6;

--
-- AUTO_INCREMENT cho bảng `sellertbl`
--
ALTER TABLE `sellertbl`
  MODIFY `SELID` int(10) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=8;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
