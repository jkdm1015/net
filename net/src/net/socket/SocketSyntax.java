package net.socket;
/*
 	소켓(Socket) programming
 	- 소켓 : 프로세스간에 통신에 사용되는 양쪽 끝단(End Point)
 		ex)전화기
 	- 소켓 프로그래밍 : 소켓을 이용한 통신 프로그래밍
 		프로세스간 통신을 위해 마련된 프로그램
 		자바에서는 java.net  패키지를 통해 소켓 프로그래밍을 지원함.
 */
/*
 	TCP/IP 프로토콜 :  이기종 시스템간의 통신을 위한 표준 프로토콜.
 		프로토콜의 집합.
 		- 내부적으로 TCP,UDP 모두 이 프로토콜을 통해 포함되어있음
 		- OSI 7 계층 중 전송계층에 해당됨.
 */
/*
 	TCP전송방식
 	- 연결 방식 : 연결후 통신 ( 전화기) 1:1
 	- 특징  : 신뢰성있는 데이터 전송, 데이터의 수신여부를 확인함
 			데이터가 손실되면 재전송 , UDP 보단 속도가 느림
 	- 해당 클래스 : Socket , ServerSocket 
*/
/*
 	UDT 전송 방식
 	- 연결 방식 : 비연결 방식 (방송, 택배 ) 1:1, 1:n , n:n
 	- 특징 : 신뢰성있는 데이터 전송 
 		데이터 수신 여부 확인 연결
 		데이터 손실 때도 계속 진행 .
 		TCP 보다 전송 속도 빠름
 	- 해당 클래스 : DatagramSocket, DatagramPacket , MulticastSocket
 */
public class SocketSyntax {

}
