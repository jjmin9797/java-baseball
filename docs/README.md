## 기능 목록 정의

### 💻 도메인 정의

------------------

#### ✅ Player
| 이름           | 설명                | 구분       | I / O                                        | 비고  |
|:-------------|:------------------|:---------|:---------------------------------------------|:----|
| firstNumber  | 플레이어의 첫 번째 숫자     | 변수 (int) |                                              | -   |
| secondNumber | 플레이어의 두 번째 숫자     | 변수 (int) |                                              | -   |
| thirdNumber  | 플레이어의 세 번째 숫자     | 변수 (int) |                                              | -   |
| Player       | 생성자               | 생성자      | input - firstNumber,secontNumber,thirdNumber | -   |
| getter       | 플레이어의 각 숫자를 가져온다. | getter   | -                                            | -   |
| setter       | 플레이어의 각 숫자를 설정한다. | setter   | input - firstNumber,secontNumber,thirdNumber | -   |


#### ✅ Computer
| 이름           | 설명               | 구분       | I / O                                        | 비고  |
|:-------------|:-----------------|:---------|:---------------------------------------------|:----|
| firstNumber  | 컴퓨터의 첫 번째 숫자     | 변수 (int) |                                              | -   |
| secondNumber | 컴퓨터의 두 번째 숫자     | 변수 (int) |                                              | -   |
| thirdNumber  | 컴퓨터의 세 번째 숫자     | 변수 (int) |                                              | -   |
| Computer     | 생성자              | 생성자      | input - firstNumber,secontNumber,thirdNumber | -   |
| getter       | 컴퓨터의 각 숫자를 가져온다. | getter   | -                                            | -   |
| setter       | 컴퓨터의 각 숫자를 설정한다. | setter   | input - firstNumber,secontNumber,thirdNumber | -   |



### 💻 Repository 정의

------------------

#### ✅ PlayerRepository
| 이름        | 설명               | 구분          | I / O                                       | 비고  |
|:----------|:-----------------|:------------|:--------------------------------------------|:----|
| player    | 플레이어가 입력한 숫자     | 객체 (Player) |                                             | -   |
| setPlayer | 플레이어가 입력한 숫자를 저장 | 메서드         | input - firstNuber,secondNumber,thirdNumber | -   |
| getPlayer | 플레이어가 입력한 숫자를 반환 | 메서드         | output - player                             | -   |

#### ✅ ComputerRepository
| 이름          | 설명                  | 구분            | I / O                                       | 비고  |
|:------------|:--------------------|:--------------|:--------------------------------------------|:----|
| computer    | 랜덤으로 정한 컴퓨터의 숫자     | 객체 (Computer) |                                             | -   |
| setComputer | 랜덤으로 정한 컴퓨터의 숫자를 저장 | 메서드           | input - firstNuber,secondNumber,thirdNumber | -   |
| getComputer | 컴퓨터의 숫자를 반환         | 메서드           | output - player                             | -   |