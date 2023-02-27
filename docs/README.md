## 기능 요구 사항
- 로또 구입 금액을 입력하면 구입 금액에 해당하는 로또를 발급해야 한다.
- 로또 1장의 가격은 1000원이다.

## 기능 목록 작성
- PurchaseAmount
- [x] 구입금액을 가진다.
- [x] 구입금액이 1000원 이상이 아니고 5만원을 초과하면 에러가 발생한다.
- [x] 구입금액이 1000원 단위로 나누어 떨어지지 않으면 에러가 발생한다.
- [x] 구입한 로또 개수를 계산한다.


- LotteryNumber
- [x] 번호를 하나 가진다.
- [x] 번호는 1 이상 45 이하의 숫자가 아니라면 에러가 발생한다.   


- Lottery
- [x] 로또번호가 6개가 아니면 에러가 발생한다.
- [x] 6개의 로또번호에 중복이 있으면 에러가 발생한다.
- [x] 당첨 번호와 매치하는 로또번호가 몇 개인지 확인한다.
- [x] 보너스번호가 로또번호에 포함되어 있는지 확인한다.


- WinningLottery
- [x] 당첨 로또를 가진다.
- [x] 보너스 번호를 가진다.
- [x] 당첨 로또 번호와 보너스 번호가 중복되면 에러가 발생한다.


- Rank
- [x] 일치하는 개수와 보너스번호 매치 여부를 알려주면 등수를 알려준다.
- [x] 해당 등수 당첨자의 총 상금을 계산한다.


- LotteryResult
- [x] 등수를 받아 카운트한다.
- [x] 총 상금을 계산한다.
- [x] 수익률을 계산한다.


- AutoLotteryTicketsMachine
- [x] 1이상 45이하의 숫자 6개를 가진 로또를 생성한다.
- [x] 구입 로또 개수만큼 로또를 발행한다.


- ManualLotteryTicketsMachine
- [x] 수동 로또를 발행한다.


- TicketCount
- [x] 로또 개수를 가진다.


- Receipt
- [x] 구매금액과 수동 로또 개수를 가진다.
- [x] 수동 로또 개수가 구입 로또 개수를 초과하지 않는지 확인한다.
- [x] 자동 로또 개수를 계산한다.