package com.inmobi.media;

import java.io.ByteArrayOutputStream;
import java.io.UnsupportedEncodingException;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* renamed from: com.inmobi.media.de, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C2740de extends ByteArrayOutputStream {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C2757ee f32788a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2740de(C2757ee c2757ee, int i10) {
        super(i10);
        this.f32788a = c2757ee;
    }

    @Override // java.io.ByteArrayOutputStream
    public final synchronized String toString() {
        int i10;
        i10 = ((ByteArrayOutputStream) this).count;
        if (i10 > 0) {
            int i11 = i10 - 1;
            if (((ByteArrayOutputStream) this).buf[i11] == 13) {
                i10 = i11;
            }
        }
        try {
        } catch (UnsupportedEncodingException e10) {
            throw new AssertionError(e10);
        }
        return new String(((ByteArrayOutputStream) this).buf, 0, i10, this.f32788a.f32823b.name());
    }
}
