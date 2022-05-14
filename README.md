# TestVIS
1. Nhập vào một số tự nhiên n, và một mảng gồm n số tự nhiên. 0. Sắp xếp và đưa ra số tự nhiên nhỏ nhất chưa xuất hiện trong dãy
vd:
input:
n = 4
array_input = [0,1,5,2]
output:
[0,1,2,5]
3
input:
n = 7
array_input = [0,1,0,5,2,4,3]
output:
[0,0,1,2,3,4,5]
6


Bài 2:
Cho một tập hợp gồm m phần tử là các kí tự. Các kí tự có thể giống hoặc khác nhau. Viết thuật toán in ra màn hình “số lượng” các hoán vị không trùng nhau từ tập m phần tử ban đầu
Ví dụ: tập m phần tử gồm {a,b,b,c}
Đáp án = 12
 
Bài 3:
Trong một trò chơi, người chơi cần làm đầy một bình nước có dung tích là n (lít) với số lần ít nhất có thể. Tuy nhiên, trong một lần, người chơi chỉ thực hiện được 1 trong 3 thao tác sau:
1.      Thêm một lít nước vào bình
2.      Múc từ bình đổ ra ngoài một lít nước
3.      Đổ một lượng nước bằng với lượng nước trong bình vào trong bình (tức là nhân đôi lượng nước hiện có trong bình lên)
 
Trong quá trình chơi, người chơi sẽ không được phép làm nước tràn ra khỏi bình.
Hãy viết thuật toán in ra số lần ít nhất để làm đầy bình nước, biết ban đầu bình nước không có gì
 
Ví dụ: n = 10
B1: Thêm 1 lít nước => có 1 lít nước trong bình
B2: Thêm 1 lít nước nữa => có 2 lít nước trong bình
B3: Đổ lượng nước bằng với lượng nước đang có trong bình vào trong bình => có 4 lít nước trong bình
B4: Thêm 1 lít nước nữa => có 5 lít nước trong bình
B5: Đổ lượng nước bằng với lượng nước đang có trong bình vào trong bình => có 10 lít nước trong bình => Đầy bình => Xong
Đáp án: 5 bước
 

