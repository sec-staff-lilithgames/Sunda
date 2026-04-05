package xo;

import gn.u0;
import java.nio.ByteBuffer;
import java.nio.charset.CharacterCodingException;
import java.nio.charset.CharsetDecoder;
import java.nio.charset.StandardCharsets;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class a extends to.c {

    /* renamed from: c, reason: collision with root package name */
    public static final Pattern f92167c = Pattern.compile("(.+?)='(.*?)';", 32);

    /* renamed from: a, reason: collision with root package name */
    public final CharsetDecoder f92168a = StandardCharsets.UTF_8.newDecoder();

    /* renamed from: b, reason: collision with root package name */
    public final CharsetDecoder f92169b = StandardCharsets.ISO_8859_1.newDecoder();

    @Override // to.c
    public final u0 a(to.b bVar, ByteBuffer byteBuffer) {
        String string;
        CharsetDecoder charsetDecoder = this.f92169b;
        CharsetDecoder charsetDecoder2 = this.f92168a;
        String str = null;
        try {
            string = charsetDecoder2.decode(byteBuffer).toString();
        } catch (CharacterCodingException unused) {
            try {
                String string2 = charsetDecoder.decode(byteBuffer).toString();
                charsetDecoder.reset();
                byteBuffer.rewind();
                string = string2;
            } catch (CharacterCodingException unused2) {
                charsetDecoder.reset();
                byteBuffer.rewind();
                string = null;
            } catch (Throwable th2) {
                charsetDecoder.reset();
                byteBuffer.rewind();
                throw th2;
            }
        } finally {
            charsetDecoder2.reset();
            byteBuffer.rewind();
        }
        byte[] bArr = new byte[byteBuffer.limit()];
        byteBuffer.get(bArr);
        if (string == null) {
            return new u0(new c(bArr, null, null));
        }
        Matcher matcher = f92167c.matcher(string);
        String str2 = null;
        for (int iEnd = 0; matcher.find(iEnd); iEnd = matcher.end()) {
            String strGroup = matcher.group(1);
            String strGroup2 = matcher.group(2);
            if (strGroup != null) {
                String lowerCase = mh.c.toLowerCase(strGroup);
                lowerCase.getClass();
                if (lowerCase.equals("streamurl")) {
                    str2 = strGroup2;
                } else if (lowerCase.equals("streamtitle")) {
                    str = strGroup2;
                }
            }
        }
        return new u0(new c(bArr, str, str2));
    }
}
