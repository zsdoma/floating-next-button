package hu.zsdoma.denahi.fnb;

import android.app.Activity;
import android.os.Bundle;

/**
 * The splash screen of the application that is shown while the Triangle APIs are being initialized.
 * Note that usage of this class is fully optional. You may want to allow your user to interact with
 * the application irrespective of the Session's initialization state and check for the Session's
 * state at the time of scan in your applications.
 */
public class MainActivity extends Activity {

  @Override
  public void onCreate(final Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);

    this.setContentView(R.layout.main);
  }

}
