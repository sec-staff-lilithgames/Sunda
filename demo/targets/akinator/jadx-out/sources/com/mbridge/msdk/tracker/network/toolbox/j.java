package com.mbridge.msdk.tracker.network.toolbox;

import com.mbridge.msdk.tracker.network.p;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.List;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public class j implements com.mbridge.msdk.thrid.okhttp.m {

    /* renamed from: b, reason: collision with root package name */
    private final String f44058b;

    /* renamed from: c, reason: collision with root package name */
    private final String f44059c;

    /* renamed from: d, reason: collision with root package name */
    private final p f44060d;

    public j(String str, String str2, p pVar) {
        this.f44058b = str;
        this.f44059c = str2;
        this.f44060d = pVar;
    }

    @Override // com.mbridge.msdk.thrid.okhttp.m
    public List<InetAddress> a(String str) throws UnknownHostException {
        try {
            List<InetAddress> listA = com.mbridge.msdk.thrid.okhttp.m.f43667a.a(str);
            return (listA.isEmpty() && i.b().c(this.f44058b, this.f44059c, str)) ? a(str, new UnknownHostException("DNS result is empty")) : listA;
        } catch (UnknownHostException e10) {
            if (i.b().c(this.f44058b, this.f44059c, str)) {
                return a(str, new UnknownHostException(e10.getMessage()));
            }
            throw e10;
        }
    }

    private List<InetAddress> a(String str, UnknownHostException unknownHostException) throws UnknownHostException {
        p pVar = this.f44060d;
        if (pVar != null) {
            pVar.c("local");
        }
        return i.b().a(str, unknownHostException);
    }
}
