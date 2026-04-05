package kd;

import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.regex.Pattern;
import md.s;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class a implements s {

    /* renamed from: c, reason: collision with root package name */
    public static final String f70803c;

    /* renamed from: d, reason: collision with root package name */
    public static final Set f70804d;

    /* renamed from: e, reason: collision with root package name */
    public static final a f70805e;

    /* renamed from: f, reason: collision with root package name */
    public static final a f70806f;

    /* renamed from: a, reason: collision with root package name */
    public final String f70807a;

    /* renamed from: b, reason: collision with root package name */
    public final String f70808b;

    static {
        String strA = e.a("hts/frbslgiggolai.o/0clgbthfra=snpoo", "tp:/ieaeogn.ogepscmvc/o/ac?omtjo_rt3");
        f70803c = strA;
        String strA2 = e.a("hts/frbslgigp.ogepscmv/ieo/eaybtho", "tp:/ieaeogn-agolai.o/1frlglgc/aclg");
        String strA3 = e.a("AzSCki82AwsLzKd5O8zo", "IayckHiZRO1EFl1aGoK");
        f70804d = Collections.unmodifiableSet(new HashSet(Arrays.asList(jd.e.of("proto"), jd.e.of("json"))));
        f70805e = new a(strA, null);
        f70806f = new a(strA2, strA3);
    }

    public a(String str, String str2) {
        this.f70807a = str;
        this.f70808b = str2;
    }

    public static a fromByteArray(byte[] bArr) {
        String str = new String(bArr, Charset.forName(C.UTF8_NAME));
        if (!str.startsWith("1$")) {
            throw new IllegalArgumentException("Version marker missing from extras");
        }
        String[] strArrSplit = str.substring(2).split(Pattern.quote("\\"), 2);
        if (strArrSplit.length != 2) {
            throw new IllegalArgumentException("Extra is not a valid encoded LegacyFlgDestination");
        }
        String str2 = strArrSplit[0];
        if (str2.isEmpty()) {
            throw new IllegalArgumentException("Missing endpoint in CCTDestination extras");
        }
        String str3 = strArrSplit[1];
        if (str3.isEmpty()) {
            str3 = null;
        }
        return new a(str2, str3);
    }

    public byte[] asByteArray() {
        String str = this.f70807a;
        String str2 = this.f70808b;
        if (str2 == null && str == null) {
            return null;
        }
        if (str2 == null) {
            str2 = "";
        }
        return a.b.m("1$", str, "\\", str2).getBytes(Charset.forName(C.UTF8_NAME));
    }

    public String getAPIKey() {
        return this.f70808b;
    }

    public String getEndPoint() {
        return this.f70807a;
    }

    @Override // md.s, md.r
    public byte[] getExtras() {
        return asByteArray();
    }

    @Override // md.s, md.r
    public String getName() {
        return "cct";
    }

    @Override // md.s
    public Set<jd.e> getSupportedEncodings() {
        return f70804d;
    }
}
