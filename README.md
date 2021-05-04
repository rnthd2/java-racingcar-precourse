# 자동차 경주 게임
## 진행 방법
* 숫자 야구 게임 요구사항을 파악한다.
* 요구사항에 대한 구현을 완료한 후 자신의 github 아이디에 해당하는 브랜치에 Pull Request(이하 PR)를 통해 과제를 제출한다.

## 과제 제출 과정
* [과제 제출 방법](https://github.com/next-step/nextstep-docs/tree/master/precourse)

## 온라인 코드 리뷰 과정
* [텍스트와 이미지로 살펴보는 온라인 코드 리뷰 과정](https://github.com/next-step/nextstep-docs/tree/master/codereview)

##기능 요구사항
- 주어진 횟수 동안 n대의 자동차는 전진 또는 멈출 수 있다.
- 각 자동차에 이름을 부여할 수 있다. 전진하는 자동차를 출력할 때 자동차 이름을 같이 출력한다. 
•자동차 이름은 쉼표(,)를 기준으로 구분하며 이름은 5자 이하만 가능하다.
- 사용자는 몇 번의 이동을 할 것인지를 입력할 수 있어야 한다.
- 전진하는 조건은 0에서 9 사이에서 random 값을 구한 후 random 값이 4 이상일 경우 전진하고, 3 이
하의 값이면 멈춘다.
- 자동차 경주 게임을 완료한 후 누가 우승했는지를 알려준다. 우승자는 한 명 이상일 수 있다.

## 프로그래밍 요구사항
- 일급콜렉션을 활용해 구현한다.
- 모든 원시값과 문자열을 포장한다.
- 함수 분리, 클래스 단위 분리하여 구현한다.
- TDD로 구현한다.

##화면 구현 목록
1. 사용자에게 경주할 자동차의 이름을 요구한다. 
- 이름은 쉼표(,) 기준으로 구분
- 이름은 5자 이하
2. 사용자에게 경주할 자동차의 이름을 입력 받는다.
3. 사용자에게 시도할 회수를 요구한다.
4. 사용자에게 시도할 회수를 입력 받는다.
5. 실행결과를 시도할 회수만큼 화면에 출력한다.
6. 게임을 완료하면 우승자를 화면에 출력한다.
- 우승자는 한명 이상이 될 수 도 있다.

##핵심 로직 구현 목록
- 각 자동차는 전진 또는 정지 할 수 있다.
- 각 자동차는 5자 이하의 이름이 있다.
- 각 자동차는 전진하는 조건은 0에서 9 사이에서 랜덤값을 구하고 랜덤값이 4 이상이면 전진, 3이하이면 정지한다.
- 각 자동차는 전진 할 수 있는 회수는 정해져있다.
- 자동차들 중 시도할 회수대로 게임을 완료하면 우승자(자동차)가 정해진다.

 




