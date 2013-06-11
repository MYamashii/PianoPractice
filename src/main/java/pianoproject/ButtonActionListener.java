package pianoproject;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


/**
 * @author yamashita
 * @version $Revision$, 2013/06/11
 */
public class ButtonActionListener implements ActionListener {

  String note;

  /**
   * 新しく生成された<code>ButtonActionListener</code>オブジェクトを初期化します。
   * 
   * @param text
   */
  public ButtonActionListener(String text) {
    this.note = text;
  }

  @Override
  public void actionPerformed(ActionEvent e) {
    System.out.println("Button pressed"); //$NON-NLS-1$
    AnswerChecker checker = new AnswerChecker();
    checker.showWindow(this.note);
  }

}