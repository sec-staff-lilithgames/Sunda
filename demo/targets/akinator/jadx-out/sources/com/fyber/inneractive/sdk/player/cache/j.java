package com.fyber.inneractive.sdk.player.cache;

import java.io.ByteArrayOutputStream;
import java.io.UnsupportedEncodingException;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class j extends ByteArrayOutputStream {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ k f24374a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(k kVar, int i10) {
        super(i10);
        this.f24374a = kVar;
    }

    @Override // java.io.ByteArrayOutputStream
    public final String toString() {
        int i10 = ((ByteArrayOutputStream) this).count;
        if (i10 > 0) {
            int i11 = i10 - 1;
            if (((ByteArrayOutputStream) this).buf[i11] == 13) {
                i10 = i11;
            }
        }
        try {
            return new String(((ByteArrayOutputStream) this).buf, 0, i10, this.f24374a.f24376b.name());
        } catch (UnsupportedEncodingException e10) {
            throw new AssertionError(e10);
        }
    }
}
