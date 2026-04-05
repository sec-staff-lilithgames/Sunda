package g5;

import android.util.Log;
import android.view.KeyEvent;
import android.view.View;
import android.widget.SeekBar;
import androidx.preference.SeekBarPreference;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class v implements View.OnKeyListener {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ SeekBarPreference f57327b;

    public v(SeekBarPreference seekBarPreference) {
        this.f57327b = seekBarPreference;
    }

    @Override // android.view.View.OnKeyListener
    public boolean onKey(View view, int i10, KeyEvent keyEvent) {
        if (keyEvent.getAction() != 0) {
            return false;
        }
        SeekBarPreference seekBarPreference = this.f57327b;
        if ((!seekBarPreference.W && (i10 == 21 || i10 == 22)) || i10 == 23 || i10 == 66) {
            return false;
        }
        SeekBar seekBar = seekBarPreference.U;
        if (seekBar != null) {
            return seekBar.onKeyDown(i10, keyEvent);
        }
        Log.e("SeekBarPreference", "SeekBar view is null and hence cannot be adjusted.");
        return false;
    }
}
