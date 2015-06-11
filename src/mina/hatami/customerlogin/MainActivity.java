package mina.hatami.customerlogin;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
	}

	public void buttonClick(View view) {
		Intent intent;

		// get the id of the view clicked. (in this case button)
		switch (view.getId()) {
		case R.id.btAddCustomer:
			intent = new Intent(this, AddCustomerActivity.class);
			startActivity(intent);

		case R.id.btCustomerList:
			intent = new Intent(this, CustomerListActivity.class);
			startActivity(intent);

		case R.id.btChangePass:
			intent = new Intent(this, ChangePasswordActivity.class);
			startActivity(intent);
			
			default:
				return;
		}
	}
}
