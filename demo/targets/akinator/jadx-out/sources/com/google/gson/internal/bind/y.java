package com.google.gson.internal.bind;

import com.google.gson.Gson;
import com.google.gson.stream.JsonReader;
import java.io.IOException;
import java.lang.reflect.Type;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final class y extends com.google.gson.k0 {

    /* renamed from: a, reason: collision with root package name */
    public final Gson f30040a;

    /* renamed from: b, reason: collision with root package name */
    public final com.google.gson.k0 f30041b;

    /* renamed from: c, reason: collision with root package name */
    public final Type f30042c;

    public y(Gson gson, com.google.gson.k0 k0Var, Type type) {
        this.f30040a = gson;
        this.f30041b = k0Var;
        this.f30042c = type;
    }

    @Override // com.google.gson.k0
    public Object read(JsonReader jsonReader) throws IOException {
        return this.f30041b.read(jsonReader);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:25:0x003b  */
    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.reflect.Type] */
    @Override // com.google.gson.k0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void write(com.google.gson.stream.JsonWriter r5, java.lang.Object r6) throws java.io.IOException {
        /*
            r4 = this;
            java.lang.reflect.Type r0 = r4.f30042c
            if (r6 == 0) goto L11
            boolean r1 = r0 instanceof java.lang.Class
            if (r1 != 0) goto Lc
            boolean r1 = r0 instanceof java.lang.reflect.TypeVariable
            if (r1 == 0) goto L11
        Lc:
            java.lang.Class r1 = r6.getClass()
            goto L12
        L11:
            r1 = r0
        L12:
            com.google.gson.k0 r2 = r4.f30041b
            if (r1 == r0) goto L3c
            com.google.gson.Gson r0 = r4.f30040a
            pk.a r1 = pk.a.get(r1)
            com.google.gson.k0 r0 = r0.getAdapter(r1)
            boolean r1 = r0 instanceof com.google.gson.internal.bind.t
            if (r1 != 0) goto L25
            goto L3b
        L25:
            r1 = r2
        L26:
            boolean r3 = r1 instanceof com.google.gson.internal.bind.x
            if (r3 == 0) goto L36
            r3 = r1
            com.google.gson.internal.bind.x r3 = (com.google.gson.internal.bind.x) r3
            com.google.gson.k0 r3 = r3.getSerializationDelegate()
            if (r3 != r1) goto L34
            goto L36
        L34:
            r1 = r3
            goto L26
        L36:
            boolean r1 = r1 instanceof com.google.gson.internal.bind.t
            if (r1 != 0) goto L3b
            goto L3c
        L3b:
            r2 = r0
        L3c:
            r2.write(r5, r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.gson.internal.bind.y.write(com.google.gson.stream.JsonWriter, java.lang.Object):void");
    }
}
