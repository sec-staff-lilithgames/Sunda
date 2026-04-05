package wr;

import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.nio.charset.Charset;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class c1 {

    /* renamed from: c, reason: collision with root package name */
    public static final mh.d1 f90845c = mh.d1.on(AbstractJsonLexerKt.COMMA);

    /* renamed from: d, reason: collision with root package name */
    public static final c1 f90846d = emptyInstance().with(new y(), true).with(z.f91209a, false);

    /* renamed from: a, reason: collision with root package name */
    public final Map f90847a;

    /* renamed from: b, reason: collision with root package name */
    public final byte[] f90848b;

    public c1(a1 a1Var, boolean z10, c1 c1Var) {
        String messageEncoding = a1Var.getMessageEncoding();
        mh.p1.checkArgument(!messageEncoding.contains(","), "Comma is currently not allowed in message encoding");
        int size = c1Var.f90847a.size();
        LinkedHashMap linkedHashMap = new LinkedHashMap(c1Var.f90847a.containsKey(a1Var.getMessageEncoding()) ? size : size + 1);
        for (b1 b1Var : c1Var.f90847a.values()) {
            String messageEncoding2 = b1Var.f90822a.getMessageEncoding();
            if (!messageEncoding2.equals(messageEncoding)) {
                linkedHashMap.put(messageEncoding2, new b1(b1Var.f90822a, b1Var.f90823b));
            }
        }
        linkedHashMap.put(messageEncoding, new b1(a1Var, z10));
        this.f90847a = Collections.unmodifiableMap(linkedHashMap);
        this.f90848b = f90845c.join(getAdvertisedMessageEncodings()).getBytes(Charset.forName(C.ASCII_NAME));
    }

    public static c1 emptyInstance() {
        return new c1();
    }

    public static c1 getDefaultInstance() {
        return f90846d;
    }

    public Set<String> getAdvertisedMessageEncodings() {
        Map map = this.f90847a;
        HashSet hashSet = new HashSet(map.size());
        for (Map.Entry entry : map.entrySet()) {
            if (((b1) entry.getValue()).f90823b) {
                hashSet.add((String) entry.getKey());
            }
        }
        return Collections.unmodifiableSet(hashSet);
    }

    public Set<String> getKnownMessageEncodings() {
        return this.f90847a.keySet();
    }

    public a1 lookupDecompressor(String str) {
        b1 b1Var = (b1) this.f90847a.get(str);
        if (b1Var != null) {
            return b1Var.f90822a;
        }
        return null;
    }

    public c1 with(a1 a1Var, boolean z10) {
        return new c1(a1Var, z10, this);
    }

    public c1() {
        this.f90847a = new LinkedHashMap(0);
        this.f90848b = new byte[0];
    }
}
