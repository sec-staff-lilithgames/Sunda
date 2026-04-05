package k3;

import android.media.AudioAttributes;
import android.net.Uri;
import android.os.Build;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public class c0 {

    /* renamed from: a, reason: collision with root package name */
    public final d0 f70135a;

    public c0(String str, int i10) {
        this.f70135a = new d0(str, i10);
    }

    public d0 build() {
        return this.f70135a;
    }

    public c0 setConversationId(String str, String str2) {
        if (Build.VERSION.SDK_INT >= 30) {
            d0 d0Var = this.f70135a;
            d0Var.f70154m = str;
            d0Var.f70155n = str2;
        }
        return this;
    }

    public c0 setDescription(String str) {
        this.f70135a.f70145d = str;
        return this;
    }

    public c0 setGroup(String str) {
        this.f70135a.f70146e = str;
        return this;
    }

    public c0 setImportance(int i10) {
        this.f70135a.f70144c = i10;
        return this;
    }

    public c0 setLightColor(int i10) {
        this.f70135a.f70151j = i10;
        return this;
    }

    public c0 setLightsEnabled(boolean z10) {
        this.f70135a.f70150i = z10;
        return this;
    }

    public c0 setName(CharSequence charSequence) {
        this.f70135a.f70143b = charSequence;
        return this;
    }

    public c0 setShowBadge(boolean z10) {
        this.f70135a.f70147f = z10;
        return this;
    }

    public c0 setSound(Uri uri, AudioAttributes audioAttributes) {
        d0 d0Var = this.f70135a;
        d0Var.f70148g = uri;
        d0Var.f70149h = audioAttributes;
        return this;
    }

    public c0 setVibrationEnabled(boolean z10) {
        this.f70135a.f70152k = z10;
        return this;
    }

    public c0 setVibrationPattern(long[] jArr) {
        boolean z10 = jArr != null && jArr.length > 0;
        d0 d0Var = this.f70135a;
        d0Var.f70152k = z10;
        d0Var.f70153l = jArr;
        return this;
    }
}
