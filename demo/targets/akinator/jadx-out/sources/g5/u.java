package g5;

import android.widget.SeekBar;
import android.widget.TextView;
import androidx.preference.SeekBarPreference;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class u implements SeekBar.OnSeekBarChangeListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ SeekBarPreference f57326a;

    public u(SeekBarPreference seekBarPreference) {
        this.f57326a = seekBarPreference;
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public void onProgressChanged(SeekBar seekBar, int i10, boolean z10) {
        SeekBarPreference seekBarPreference = this.f57326a;
        if (z10 && (seekBarPreference.Y || !seekBarPreference.T)) {
            seekBarPreference.r(seekBar);
            return;
        }
        int i11 = i10 + seekBarPreference.Q;
        TextView textView = seekBarPreference.V;
        if (textView != null) {
            textView.setText(String.valueOf(i11));
        }
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public void onStartTrackingTouch(SeekBar seekBar) {
        this.f57326a.T = true;
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public void onStopTrackingTouch(SeekBar seekBar) {
        SeekBarPreference seekBarPreference = this.f57326a;
        seekBarPreference.T = false;
        if (seekBar.getProgress() + seekBarPreference.Q != seekBarPreference.P) {
            seekBarPreference.r(seekBar);
        }
    }
}
