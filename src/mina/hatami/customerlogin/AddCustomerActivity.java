package mina.hatami.customerlogin;

import android.app.Activity;
import android.app.DialogFragment;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class AddCustomerActivity extends Activity {

	private int SELECT_PHOTO = 1;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_add_customer);
	}

	public void dataPicker(View view) {
		Intent intent;
		switch(view.getId()){
		case R.id.btImagePicker :
			intent = new Intent(Intent.ACTION_PICKو "image/*");
			startActivityForResult(intent, SELECT_PHOTO );
			return;
		case R.id.btDatePicker :
			 DialogFragment newFragment = new DatePickerFragment();
			    newFragment.show(getFragmentManager(), "datePicker");
			
			return;
			
			default: 
				return;
		}
	}
	
	@Override
	protected void onActivityResult(int requestCode, int resultCode, Intent data) {
		if(requestCode == SELECT_PHOTO && resultCode == RESULT_OK){
			
		}
		super.onActivityResult(requestCode, resultCode, data);
	}
}
