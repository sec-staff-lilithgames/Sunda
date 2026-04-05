package androidx.media;

import android.os.Bundle;
import android.os.IBinder;
import androidx.media.MediaBrowserServiceCompat;
import java.util.HashMap;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class k implements IBinder.DeathRecipient {

    /* renamed from: a, reason: collision with root package name */
    public final String f6831a;

    /* renamed from: b, reason: collision with root package name */
    public final int f6832b;

    /* renamed from: c, reason: collision with root package name */
    public final int f6833c;

    /* renamed from: d, reason: collision with root package name */
    public final l0 f6834d;

    /* renamed from: e, reason: collision with root package name */
    public final Bundle f6835e;

    /* renamed from: f, reason: collision with root package name */
    public final i0 f6836f;

    /* renamed from: g, reason: collision with root package name */
    public final HashMap f6837g = new HashMap();

    /* renamed from: h, reason: collision with root package name */
    public MediaBrowserServiceCompat.a f6838h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ MediaBrowserServiceCompat f6839i;

    public k(MediaBrowserServiceCompat mediaBrowserServiceCompat, String str, int i10, int i11, Bundle bundle, i0 i0Var) {
        this.f6839i = mediaBrowserServiceCompat;
        this.f6831a = str;
        this.f6832b = i10;
        this.f6833c = i11;
        this.f6834d = new l0(str, i10, i11);
        this.f6835e = bundle;
        this.f6836f = i0Var;
    }

    @Override // android.os.IBinder.DeathRecipient
    public void binderDied() {
        this.f6839i.f6777h.post(new j(this));
    }
}
