package androidx.localbroadcastmanager.content;

import android.content.BroadcastReceiver;
import android.content.IntentFilter;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final IntentFilter f6758a;

    /* renamed from: b, reason: collision with root package name */
    public final BroadcastReceiver f6759b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f6760c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f6761d;

    public c(BroadcastReceiver broadcastReceiver, IntentFilter intentFilter) {
        this.f6758a = intentFilter;
        this.f6759b = broadcastReceiver;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder(128);
        sb2.append("Receiver{");
        sb2.append(this.f6759b);
        sb2.append(" filter=");
        sb2.append(this.f6758a);
        if (this.f6761d) {
            sb2.append(" DEAD");
        }
        sb2.append("}");
        return sb2.toString();
    }
}
