package io.odeeo.internal.w;

import io.odeeo.internal.s.d;
import io.odeeo.internal.s.g;
import io.odeeo.internal.t0.e;
import java.nio.ByteBuffer;
import java.nio.charset.CharacterCodingException;
import java.nio.charset.CharsetDecoder;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class a extends g {

    /* renamed from: c, reason: collision with root package name */
    public static final Pattern f67290c = Pattern.compile("(.+?)='(.*?)';", 32);

    /* renamed from: a, reason: collision with root package name */
    public final CharsetDecoder f67291a = e.f66406c.newDecoder();

    /* renamed from: b, reason: collision with root package name */
    public final CharsetDecoder f67292b = e.f66405b.newDecoder();

    @Override // io.odeeo.internal.s.g
    public io.odeeo.internal.s.a a(d dVar, ByteBuffer byteBuffer) {
        String strA = a(byteBuffer);
        byte[] bArr = new byte[byteBuffer.limit()];
        byteBuffer.get(bArr);
        String str = null;
        if (strA == null) {
            return new io.odeeo.internal.s.a(new c(bArr, null, null));
        }
        Matcher matcher = f67290c.matcher(strA);
        String str2 = null;
        for (int iEnd = 0; matcher.find(iEnd); iEnd = matcher.end()) {
            String strGroup = matcher.group(1);
            String strGroup2 = matcher.group(2);
            if (strGroup != null) {
                String lowerCase = io.odeeo.internal.t0.c.toLowerCase(strGroup);
                lowerCase.getClass();
                if (lowerCase.equals("streamurl")) {
                    str2 = strGroup2;
                } else if (lowerCase.equals("streamtitle")) {
                    str = strGroup2;
                }
            }
        }
        return new io.odeeo.internal.s.a(new c(bArr, str, str2));
    }

    public final String a(ByteBuffer byteBuffer) {
        try {
            return this.f67291a.decode(byteBuffer).toString();
        } catch (CharacterCodingException unused) {
            try {
                String string = this.f67292b.decode(byteBuffer).toString();
                this.f67292b.reset();
                byteBuffer.rewind();
                return string;
            } catch (CharacterCodingException unused2) {
                this.f67292b.reset();
                byteBuffer.rewind();
                return null;
            } catch (Throwable th2) {
                this.f67292b.reset();
                byteBuffer.rewind();
                throw th2;
            }
        } finally {
            this.f67291a.reset();
            byteBuffer.rewind();
        }
    }
}
