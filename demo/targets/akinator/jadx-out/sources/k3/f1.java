package k3;

import android.os.Bundle;
import java.util.HashSet;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class f1 {

    /* renamed from: a, reason: collision with root package name */
    public final String f70169a;

    /* renamed from: d, reason: collision with root package name */
    public CharSequence f70172d;

    /* renamed from: e, reason: collision with root package name */
    public CharSequence[] f70173e;

    /* renamed from: b, reason: collision with root package name */
    public final HashSet f70170b = new HashSet();

    /* renamed from: c, reason: collision with root package name */
    public final Bundle f70171c = new Bundle();

    /* renamed from: f, reason: collision with root package name */
    public boolean f70174f = true;

    /* renamed from: g, reason: collision with root package name */
    public int f70175g = 0;

    public f1(String str) {
        if (str == null) {
            throw new IllegalArgumentException("Result key can't be null");
        }
        this.f70169a = str;
    }

    public f1 addExtras(Bundle bundle) {
        if (bundle != null) {
            this.f70171c.putAll(bundle);
        }
        return this;
    }

    public g1 build() {
        return new g1(this.f70169a, this.f70172d, this.f70173e, this.f70174f, this.f70175g, this.f70171c, this.f70170b);
    }

    public Bundle getExtras() {
        return this.f70171c;
    }

    public f1 setAllowDataType(String str, boolean z10) {
        HashSet hashSet = this.f70170b;
        if (z10) {
            hashSet.add(str);
            return this;
        }
        hashSet.remove(str);
        return this;
    }

    public f1 setAllowFreeFormInput(boolean z10) {
        this.f70174f = z10;
        return this;
    }

    public f1 setChoices(CharSequence[] charSequenceArr) {
        this.f70173e = charSequenceArr;
        return this;
    }

    public f1 setEditChoicesBeforeSending(int i10) {
        this.f70175g = i10;
        return this;
    }

    public f1 setLabel(CharSequence charSequence) {
        this.f70172d = charSequence;
        return this;
    }
}
