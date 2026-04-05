package q;

import android.graphics.Typeface;
import android.widget.TextView;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class r0 implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ TextView f82216b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Typeface f82217c;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f82218e;

    public r0(TextView textView, Typeface typeface, int i10) {
        this.f82216b = textView;
        this.f82217c = typeface;
        this.f82218e = i10;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f82216b.setTypeface(this.f82217c, this.f82218e);
    }
}
