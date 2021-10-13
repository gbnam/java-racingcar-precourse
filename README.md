# 자동차 경주 게임
## 진행 방법
* 자동차 경주 게임 요구사항을 파악한다.
* 요구사항에 대한 구현을 완료한 후 자신의 github 아이디에 해당하는 브랜치에 Pull Request(이하 PR)를 통해 과제를 제출한다.

## 과제 제출 과정
* [과제 제출 방법](https://github.com/next-step/nextstep-docs/tree/master/precourse)

## 기능 요구사항
    - 주어진 횟수 동안 n대의 자동차는 전진 또는 멈출 수 있다.
    - 각 자동차에 이름을 부여할 수 있다. 전진하는 자동차를 출력할 때 자동차 이름을 같이 출력한다.
    - 자동차 이름은 쉼표(,)를 기준으로 구분하며 이름은 5자 이하만 가능하다.
    - 사용자는 몇 번의 이동을 할 것인지를 입력할 수 있어야 한다.
    - 전진하는 조건은 0에서 9 사이에서 random 값을 구한 후 random 값이 4 이상일 경우 전진하고, 3 이
    - 하의 값이면 멈춘다.
    - 자동차 경주 게임을 완료한 후 누가 우승했는지를 알려준다.
    - 우승자가 한 명 이상일 경우, 쉼표(,)로 이름을 구분해 출력한다.
    - 사용자가 잘못된 값을 입력할 경우 “[ERROR]”로 시작하는 에러 메시지를 출력 후 입력을 다시 받는다.

## 기능목록
- [x] 자동차명 입력받기
- [x] 콤마 구분하여 자동차명 파싱 및 객체 생성
- [x] 현재까지 저장된 자동차들 status 출력
- [x] 입력받은 문자열 5글자 이하여부 제약사항 체크 
- [x] 5글자 초과시 문구 출력 
- [x] 제약사항 통과할때까지 반복 입력받기
- [x] 일급컬렉션 생성자에서 자동차이름 생성 및 제약사항 체크
- [x] 시도 횟수 입력받기
- [x] 시도 횟수 숫자만 입력여부 체크
- [x] 제약사항 통과할때까지 반복 입력받기
- [x] 0-9사이 랜덤값 리턴
- [x] 랜덤값이 4이상일 경우 move
- [x] 각 자동차별 랜덤값을 받아 이동 반복
- [x] 입력받은 시도 횟수만큼 반복
- [ ] 각 자동차별 실행결과 출력
- [ ] 우승한 자동차 출력
- [ ] 사용자 입력값 오류시 "[ERROR]" 로 시작하는 에러메시지 출력


## 제약사항 체크
- [ ] 실행 시작점은 src/main/java의 racinggame.Application의 main()이다
- [ ] JDK8 실행가능
- [ ] nextstep.utils의 Randoms.pickNumberInRange(), Console.readLine() API 활용
- [ ] 구현 완료시 src/test/java 폴더의 racinggame.ApplicationTest에 있는 2개의 testcase 성공
- [ ] [자바 코드 컨벤션](https://naver.github.io/hackday-conventions-java/) 지키면서 프로그래밍
- [ ] indent depth 2가 넘지 않도록 구현
- [ ] stream api 사용금지
- [ ] else 사용금지
- [ ] 함수(메소드)는 라인 수 10 이하로 구현 

##단위테스트
- [ ] 도메인 로직에 단위테스트 구현 (UI로직은 제외)
- [ ] 핵심로직과 UI로직 분리
- [ ] MVC패턴 기반 구현 후 View, Controller를 제외한 Model에 대한 단위테스트 추가

## 제출
- 커밋시 참고 : [the AngularJS commit conventions](https://gist.github.com/stephenparish/9941e89d80e2bc58a153/)
- 과제제출 : [제출방법](https://github.com/next-step/nextstep-docs/tree/master/precourse)
    - [ ] PR 제출
    - [ ] 메일발송