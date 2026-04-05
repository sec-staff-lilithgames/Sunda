package com.bytedance.sdk.openadsdk.core.p000if.jpo.jpo;

import android.content.Context;
import android.text.TextUtils;
import com.bytedance.sdk.openadsdk.core.model.dt;
import com.bytedance.sdk.openadsdk.core.p000if.jd.wqx;
import com.bytedance.sdk.openadsdk.core.p000if.jpo.jd;
import com.bytedance.sdk.openadsdk.core.p000if.wqx.jpo;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class my extends jd {

    /* renamed from: qk, reason: collision with root package name */
    public static final String f20412qk = null;

    public my(Context context, int i10, int i11) {
        super(context, i10, i11);
    }

    public static int jd(String str) {
        if (TextUtils.isEmpty(str)) {
            return Integer.MIN_VALUE;
        }
        try {
            return Integer.parseInt(str);
        } catch (NumberFormatException unused) {
            return Integer.MIN_VALUE;
        }
    }

    private void wqx(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        wqx.jpo(wqx.jpo((dt) null, (List<wqx>) Collections.singletonList(new wqx.jpo(str).jpo()), this.jpo > 0 ? com.bytedance.sdk.openadsdk.core.p000if.jpo.jpo.NO_ADS_VAST_RESPONSE : com.bytedance.sdk.openadsdk.core.p000if.jpo.jpo.UNDEFINED_ERROR, -1L, (String) null, (String) null), (wqx.jd) null);
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x005e A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // com.bytedance.sdk.openadsdk.core.p000if.jpo.jd
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public com.bytedance.sdk.openadsdk.core.p000if.jpo jpo(java.lang.String r5, java.io.File r6, java.util.List<com.bytedance.sdk.openadsdk.core.p000if.jd.wqx> r7) throws java.lang.Throwable {
        /*
            r4 = this;
            r0 = 0
            r4.my = r0
            android.content.Context r1 = r4.f20405jd
            r2 = 0
            if (r1 != 0) goto Lc
            r5 = -1
            r4.my = r5
            return r2
        Lc:
            boolean r1 = android.text.TextUtils.isEmpty(r5)
            if (r1 == 0) goto L18
            if (r6 != 0) goto L18
            r5 = -2
            r4.my = r5
            return r2
        L18:
            boolean r1 = android.text.TextUtils.isEmpty(r5)     // Catch: java.lang.Throwable -> L2a java.lang.Exception -> L4f
            java.lang.String r3 = "UTF-8"
            if (r1 != 0) goto L2c
            java.io.ByteArrayInputStream r6 = new java.io.ByteArrayInputStream     // Catch: java.lang.Throwable -> L2a java.lang.Exception -> L4f
            byte[] r5 = r5.getBytes(r3)     // Catch: java.lang.Throwable -> L2a java.lang.Exception -> L4f
            r6.<init>(r5)     // Catch: java.lang.Throwable -> L2a java.lang.Exception -> L4f
            goto L32
        L2a:
            r5 = move-exception
            goto L5c
        L2c:
            java.io.FileInputStream r5 = new java.io.FileInputStream     // Catch: java.lang.Throwable -> L2a java.lang.Exception -> L4f
            r5.<init>(r6)     // Catch: java.lang.Throwable -> L2a java.lang.Exception -> L4f
            r6 = r5
        L32:
            org.xmlpull.v1.XmlPullParser r5 = android.util.Xml.newPullParser()     // Catch: java.lang.Throwable -> L4c java.lang.Exception -> L50
            java.lang.String r1 = "http://xmlpull.org/v1/doc/features.html#process-namespaces"
            r5.setFeature(r1, r0)     // Catch: java.lang.Throwable -> L4c java.lang.Exception -> L50
            r5.setInput(r6, r3)     // Catch: java.lang.Throwable -> L4c java.lang.Exception -> L50
            r5.nextTag()     // Catch: java.lang.Throwable -> L4c java.lang.Exception -> L50
            com.bytedance.sdk.openadsdk.core.if.jpo r5 = r4.jpo(r5, r7)     // Catch: java.lang.Throwable -> L4c java.lang.Exception -> L50
            r4.jpo(r5)     // Catch: java.lang.Throwable -> L4c java.lang.Exception -> L50
            r6.close()     // Catch: java.io.IOException -> L4b
        L4b:
            return r5
        L4c:
            r5 = move-exception
            r2 = r6
            goto L5c
        L4f:
            r6 = r2
        L50:
            r5 = -3
            r4.my = r5     // Catch: java.lang.Throwable -> L4c
            r4.jpo(r2)     // Catch: java.lang.Throwable -> L4c
            if (r6 == 0) goto L5b
            r6.close()     // Catch: java.io.IOException -> L5b
        L5b:
            return r2
        L5c:
            if (r2 == 0) goto L61
            r2.close()     // Catch: java.io.IOException -> L61
        L61:
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.openadsdk.core.p000if.jpo.jpo.my.jpo(java.lang.String, java.io.File, java.util.List):com.bytedance.sdk.openadsdk.core.if.jpo");
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static class jpo {

        /* renamed from: cm, reason: collision with root package name */
        String f20413cm;

        /* renamed from: jd, reason: collision with root package name */
        jpo.EnumC0118jpo f20414jd;
        String jpo;
        jpo.jd wqx;
        final List<wqx> my = new ArrayList();

        /* renamed from: jj, reason: collision with root package name */
        final List<wqx> f20415jj = new ArrayList();

        /* renamed from: qk, reason: collision with root package name */
        float f20416qk = Float.MIN_VALUE;

        public jpo() {
        }

        public void jd(String str) {
            this.f20415jj.add(new wqx.jpo(str).jpo());
        }

        public void jpo(String str, jpo.EnumC0118jpo enumC0118jpo, jpo.jd jdVar) {
            this.jpo = str;
            this.f20414jd = enumC0118jpo;
            this.wqx = jdVar;
        }

        public void jpo(String str) {
            this.my.add(new wqx.jpo(str).jpo());
        }

        public jpo(String str, jpo.EnumC0118jpo enumC0118jpo, jpo.jd jdVar) {
            jpo(str, enumC0118jpo, jdVar);
        }
    }

    public static String jd(XmlPullParser xmlPullParser, String str) throws XmlPullParserException, IOException {
        String strTrim;
        String str2 = f20412qk;
        xmlPullParser.require(2, str2, str);
        if (xmlPullParser.next() == 4) {
            strTrim = xmlPullParser.getText().trim();
            xmlPullParser.nextTag();
        } else {
            strTrim = "";
        }
        xmlPullParser.require(3, str2, str);
        return strTrim;
    }

    /* JADX WARN: Code restructure failed: missing block: B:87:0x00d2, code lost:
    
        continue;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r16v0 */
    /* JADX WARN: Type inference failed for: r16v1 */
    /* JADX WARN: Type inference failed for: r16v2, types: [com.bytedance.sdk.openadsdk.core.if.jpo] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private com.bytedance.sdk.openadsdk.core.p000if.jpo jd(org.xmlpull.v1.XmlPullParser r19, java.util.List<com.bytedance.sdk.openadsdk.core.p000if.jd.wqx> r20) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 352
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.openadsdk.core.p000if.jpo.jpo.my.jd(org.xmlpull.v1.XmlPullParser, java.util.List):com.bytedance.sdk.openadsdk.core.if.jpo");
    }

    private void jpo(com.bytedance.sdk.openadsdk.core.p000if.jpo jpoVar) {
        if (this.f20406jj == null) {
            this.f20406jj = new jd.jpo();
        }
        jd.jpo jpoVar2 = this.f20406jj;
        jpoVar2.jpo = this.my;
        jpoVar2.f20407jd = this.jpo;
        if (jpoVar != null) {
            jpoVar2.wqx = jpoVar.jpo().f20362jd.size() <= 0;
        }
    }

    private com.bytedance.sdk.openadsdk.core.p000if.jpo jpo(XmlPullParser xmlPullParser, List<wqx> list) throws Throwable {
        XmlPullParser xmlPullParser2;
        List<wqx> list2;
        XmlPullParser xmlPullParser3;
        List<wqx> list3;
        xmlPullParser.require(2, f20412qk, "VAST");
        boolean z10 = false;
        String strJd = null;
        while (xmlPullParser.next() != 1) {
            if (xmlPullParser.getEventType() == 2) {
                String name = xmlPullParser.getName();
                if ("Error".equals(name)) {
                    strJd = jd(xmlPullParser, name);
                } else {
                    if ("Ad".equals(name)) {
                        if (jpo(xmlPullParser.getAttributeValue(f20412qk, "sequence"))) {
                            while (true) {
                                if (xmlPullParser.next() == 3 && "Ad".equals(xmlPullParser.getName())) {
                                    xmlPullParser2 = xmlPullParser;
                                    list2 = list;
                                    z10 = true;
                                    break;
                                }
                                if (xmlPullParser.getEventType() == 2) {
                                    String name2 = xmlPullParser.getName();
                                    if ("InLine".equals(name2)) {
                                        xmlPullParser3 = xmlPullParser;
                                        list3 = list;
                                        com.bytedance.sdk.openadsdk.core.p000if.jpo jpoVarJpo = jd.jpo(this.f20405jd, xmlPullParser3, list3, this.wqx, this.f20404cm);
                                        if (jpoVarJpo != null) {
                                            if (!TextUtils.isEmpty(jpoVarJpo.qk())) {
                                                return jpoVarJpo;
                                            }
                                            this.my = -6;
                                            return null;
                                        }
                                    } else {
                                        xmlPullParser3 = xmlPullParser;
                                        list3 = list;
                                        if ("Wrapper".equals(name2)) {
                                            com.bytedance.sdk.openadsdk.core.p000if.jpo jpoVarJd = jd(xmlPullParser3, list3);
                                            if (jpoVarJd != null) {
                                                return jpoVarJd;
                                            }
                                        } else {
                                            jpo(xmlPullParser3);
                                        }
                                    }
                                    xmlPullParser = xmlPullParser3;
                                    list = list3;
                                }
                            }
                        } else {
                            jpo(xmlPullParser);
                            z10 = true;
                        }
                    } else {
                        xmlPullParser2 = xmlPullParser;
                        list2 = list;
                        jpo(xmlPullParser2);
                    }
                    xmlPullParser = xmlPullParser2;
                    list = list2;
                }
            }
        }
        if (!z10) {
            this.my = -4;
            wqx(strJd);
        }
        if (this.my == 0) {
            this.my = -5;
        }
        return null;
    }

    public static List<wqx> jpo(XmlPullParser xmlPullParser, String str) throws XmlPullParserException, IOException {
        return jpo(xmlPullParser, str, false);
    }

    public static List<wqx> jpo(XmlPullParser xmlPullParser, String str, boolean z10) throws XmlPullParserException, IOException {
        return jpo(jd(xmlPullParser, str), z10);
    }

    public static void jpo(XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
        if (xmlPullParser.getEventType() != 2) {
            throw new IllegalStateException();
        }
        int i10 = 1;
        while (i10 != 0) {
            int next = xmlPullParser.next();
            if (next == 2) {
                i10++;
            } else if (next == 3) {
                i10--;
            }
        }
    }

    public static void jpo(XmlPullParser xmlPullParser, String str, int i10) throws XmlPullParserException, IOException {
        while (xmlPullParser.getEventType() != 1) {
            if (str.equals(xmlPullParser.getName()) && xmlPullParser.getEventType() == i10) {
                return;
            } else {
                xmlPullParser.next();
            }
        }
    }

    private static List<wqx> jpo(String str, boolean z10) {
        if (TextUtils.isEmpty(str)) {
            return new ArrayList();
        }
        return Collections.singletonList(new wqx.jpo(str).jpo(z10).jpo());
    }
}
