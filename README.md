# bangbang

일정 >>
1월 23일 - 26일(늦어도 1월 말까지) : 기획 + DB
2월 1일 - 2월 25일 : 개발 진행.(+AWS 교체)
2월 26일 - 2월 말 : 리팩토링
3월 1일 - 3월 11일 : 리팩토링 + 발표준비

주제 선정 - 기획DB - 개발(프+백)- 리팩토링 -발표준비

규칙 >>
<<프로젝트 규칙>>
--------------
<커뮤니케이션>
카톡에 오전시작-오후시작-종료 시(오후 6시), (오늘 할 것 - 오늘 한 것 - 앞으로 할 것) 공유
일과 시작 시, 카톡에 오늘 할 것 업로드
오후 6시, 카톡에 오늘 한 것 + 내일 할 것 업로드 
--------------
<git 관련>
git 올리려고 할 때, 카톡에 공고
(ex: 누구누구 깃 올릴게요~) 
git 올린 후, 카톡에 git 내용 공유
---------------
<코드 중복-충돌>
해당 팀원에게 문의한 후에 중복-충돌 코드 수정하기.
------------
<코드 정리-리팩토링>
*코드 정리한 후에 github 업로드(최소한 gpt에게 코드 정리 관련 문의해서 해결한 후에 업로드하기)
*주석, 로그 꼼꼼히 짜기.
*fix된 기능은 관여된 팀원과 상의 하에 리팩토링 진행.
(여유 있을 때 리팩토링. 기능 구현 선순위) 
-----------------

# BEEP
BEEP프로젝트는 4인 구성의 팀으로 진행한 프로젝트입니다. 목표는 인터넷 방송 스트리밍 사이트를 구현하고자 하는 것이었습니다.

# 맡은 업무와 구현한 기능
1. SPRING SECURITY를 이용한 로그인 기능과 관련된 코드 초안작성
2. 웹소켓을 이용한 채팅기능
3. 스트리머와 구독자, 비구독자, 비로그인 시청자를 나누어 권한을 부여, 채팅에 제한을 두는 기능
4. 스트리머가 특정시청자에게 매니저 권한을 부여하고 회수 할 수 있는 기능
5. 스트리머와 매니저가 특정 시청자를 밴(채팅제한)할 수 있게하는 기능
6. 세션에 접속해 있는 인원을 구해 실시간으로 시청자의 수 표시하는 기능
7. SSE(SERVER-SENT-EVENT)를 이용해 스트리머가 방송을 시작할 시 구독자에게 방송시작 알림을 보내는 기능을 구현

# 기술스택
1. SPRING BOOT
2. JPA
3. HYBERNATE
4. ORACLE DB

# A. 각 기능에 대한 이미지 (프로젝트 마무리 후 추가)
