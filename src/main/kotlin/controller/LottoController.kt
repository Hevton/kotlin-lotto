package controller

import domain.Amount
import domain.Lotto
import domain.LottoNumber
import domain.LottoResult
import domain.LottoStore
import domain.WinningLotto
import view.InputView
import view.OutputView

class LottoController(private val inputView: InputView, private val outputView: OutputView) {

    fun run() {
        val amount = askAmount()
        val lottos = buyLotto(amount)
        outputView.outputLottos(lottos)
        val winningLotto = WinningLotto(askWinningNumbers(), askBonusNumber())
        val result = LottoResult.of(lottos, winningLotto)
        outputView.outputResult(result)
    }

    private fun askAmount(): Amount {
        outputView.outputGetAmount()
        return Amount(inputView.inputAmount())
    }

    private fun buyLotto(amount: Amount): List<Lotto> {
        val store = LottoStore()
        return store.buyLotto(amount)
    }

    private fun askWinningNumbers(): Lotto {
        outputView.outputGetWinningNumbers()
        return Lotto.create(inputView.inputWinningNumbers())
    }

    private fun askBonusNumber(): LottoNumber {
        outputView.outputGetBonusNumber()
        return LottoNumber(inputView.inputBonusNumber())
    }
}