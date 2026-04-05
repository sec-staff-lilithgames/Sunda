package nj;

import android.app.Application;
import com.google.protobuf.AbstractMessageLite;
import com.google.protobuf.Parser;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public class q0 {

    /* renamed from: a, reason: collision with root package name */
    public final Application f77000a;

    /* renamed from: b, reason: collision with root package name */
    public final String f77001b;

    public q0(Application application, String str) {
        this.f77000a = application;
        this.f77001b = str;
    }

    public <T extends AbstractMessageLite> mt.s read(Parser<T> parser) {
        return mt.s.fromCallable(new com.google.firebase.messaging.m(3, this, parser));
    }

    public mt.c write(AbstractMessageLite abstractMessageLite) {
        return mt.c.fromCallable(new com.google.firebase.messaging.m(2, this, abstractMessageLite));
    }
}
