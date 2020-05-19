# MiSaeng Groupware

#### 개요
Spring 기반으로 사내 그룹웨어 웹사이트 구현   
주요 기능 : 인사관리, 휴가관리, 전자문서&결재, 게시판, 채팅, 일정관리, :heavy_check_mark: 예약관리


#### 프로젝트 환경
Jdk 1.8    
SpringFrameWork 3.0    
SQL Developer    
Oracle 11g    
jQuery 3.4.1   

#### 관리자 계정
아이디 : admin    
비밀번호 : 1234
#### 일반사원 계정
아이디 : jminhee    
비밀번호 : 1234

#### 데이터베이스 계정
아이디 : msgAdmin    
비밀번호 : 4r3e2w1q!!

#### 사이트 접속 방법
 * http://msgroupware.na.to ~~현재 na.to 도메인이 에러 발생합니다. 아래 ip주소로 접속 부탁드립니다.~~       
   http://3.34.15.69/   
   AWS를 사용하여 도메인 배포   
 * http://localhost:9090/msg/    
   크롬을 사용하여 접속 추천   
 
 
 #### 사이트 안내   
##### 인사정보
	 인사 정보 관리
	 근태 관리
	 휴가 관리
##### 전자문서
	 결재완료된 모든 전자문서 검색
	 진행중인 나와 관련된 전자문서 검색
	 전자문서 및 결재선 만들기
##### 커뮤니케이션
	 게시판 글쓰기 및 스크랩 기능
	 1:1 채팅(DM) 및 1:N 채팅(channel)
	 읽지않은 메시지 목록 Nav바에 출력
	 채널 생성, 수정, 삭제
##### :heavy_check_mark: 일정관리
	 개인 일정 생성, 수정, 삭제
	 팀 일정 열람
	 카테고리 및 사용자 별 일정보기
##### :heavy_check_mark: 예약관리
	 회의실 예약 관리
	 법인차량 예약 관리
	 풀캘린더 오픈소스 사용
	 
#### 프로젝트 DB 구조 설계    
![MSG](https://user-images.githubusercontent.com/58028527/82322841-217ab480-9a12-11ea-968f-da63d3f0b239.png)
