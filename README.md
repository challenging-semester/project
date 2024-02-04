# Challenging-Semester
[도전학기제] 아카이브 웹사이트

## 프로젝트 소개
![image](https://github.com/challenging-semester/project/assets/110469361/46ed6e49-3265-4c36-a06b-d8d0056eb57e)

회원가입, 로그인, 아카이브 카페 생성, 게시물 및 댓글 작성 등 커뮤니티 기능을 하는 웹사이트입니다. 북마크한 카테고리의 새 글이 생기면 메인화면의 책장에 책이 새로이 생기는 형태로 확인할 수 있습니다.

## 개발 기간
- 2023.4. - 2023.6.

### 업무분장
- 팀장 김예진: 프로젝트 관리, 데이터베이스 설계, 백엔드 위주 개발, 배포
- 팀원 이효정: 데이터베이스 설계, 프론트엔드 위주 개발, 배포

### 개발환경
- 개발언어: HTML, JS, CSS, JAVA
- 웹 프레임워크: Spring Boot
- 데이터베이스: MySQL
- 클라우드: AWS

## 주요 기술
 **가) 웹사이트**<br><br>
 **1) 회원가입/로그인**<br>
 ![image](https://github.com/challenging-semester/project/assets/110469361/89259db0-40e9-43fb-be8f-ba101d892494)

회원가입 시 아이디, 비밀번호, 이름, 이메일, 생년월일 모든 칸에 입력이 됐는지를 검증하고, 생년월일은 현재 날짜 이후 미래는 선택할 수 없다. 이렇게 가입하여 저장된 아이디, 비밀번호로 로그인 시 해당 값들도 입력이 됐는지 검증한다. 단, 데이터베이스에서 일치하는 값이 없으면 아이디나 비밀번호가 틀렸다는 알림과 함께 다시 로그인 페이지로 돌아온다.

**2) 메인화면**<br>
 ![image](https://github.com/challenging-semester/project/assets/110469361/758ba5c8-0fab-4f43-9e31-2da72cd315aa)

로그인 성공 시 진입한다. 유저 ID는 UUID로 바꾸어 쿠키에 저장해둔다.

초기 메인화면에서는 가입한 아카이브 카페와 북마크해둔 카테고리의 책장을 확인할 수 있으며, 검색을 통해 카페를 검색할 수 있다. 카페 메인화면에서는 카페 내 닉네임과 본인의 등급을 확인할 수 있다. 좌측 하단은 게시판 카테고리로, 클릭하면 특정 카테고리의 게시물만 확인할 수 있다. 카테고리명 옆 + 기호를 클릭하여 북마크를 할 수 있고 - 기호로 바뀌며, - 기호를 클릭하면 북마크를 해제할 수 있다.

게시물 검색 조건은 전체, 제목, 내용 세 가지로 되어있다.
모든 회원은 글쓰기가 가능하고, 스탭 이상의 회원만 카테고리 생성과 삭제, 멤버 목록 조회가 가능하다.

 **2) 게시물**<br>
![image](https://github.com/challenging-semester/project/assets/110469361/95c21eb0-72a1-47cf-84b9-8c591489b7ab)

카테고리를 선택하고 제목, 본문을 입력하여 게시물을 올릴 수 있다. 작성자는 게시물을 수정하거나 삭제할 수 있으며, 스탭 이상의 회원은 모든 회원의 게시물을 삭제할 수 있다. 댓글 역시 작성하고 삭제할 수 있다.

**3) 멤버목록/등급변경**<br>
![image](https://github.com/challenging-semester/project/assets/110469361/1ed218c6-a034-4bc0-af6a-485833b29029)

스탭 이상 등급만 멤버목록을 확인할 수 있으며, 현재 카페에 가입된 멤버의 등급을 변경하거나 강제탈퇴로 추방할 수 있다.

 **4) 미가입 카페**<br>
![image](https://github.com/challenging-semester/project/assets/110469361/f1fdf762-1752-4ea4-8757-802e6dc3d36e)
미가입 카페에 접속할 경우 카페 가입 버튼이 노출되며, 게시물을 열람할 수 없도록 하였다.<br>

 **나) 배포**<br><br>
 **1) AWS**<br>
AWS에서 RDS를 만들고 EC2로 배포하였으며, 탄력적 IP를 사용하였다. 

## 달성 성과<br>
-  **도전학기 수료**: 지도교수에게 지도 요청 후 프로젝트 설계부터 최종 결과물 제출까지 지속적인 지도를 받으며 자기 주도적 학습 활동을 진행
