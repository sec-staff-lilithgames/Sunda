package com.facebook.ads.redexgen.core;

import android.net.Uri;
import android.os.Handler;
import android.text.TextUtils;
import android.util.Log;
import com.applovin.shadow.okio.Utf8;
import com.facebook.ads.internal.protocol.AdErrorType;
import com.facebook.ads.internal.protocol.AdPlacementType;
import com.vungle.ads.internal.protos.Sdk;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import org.json.JSONObject;

/* renamed from: com.facebook.ads.redexgen.X.iN, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C2233iN implements MK, MP {
    public static byte[] A0C;
    public static String[] A0D = {"axrzCdv0FVVdCRJ2G5bzsKW6gzdnjkd", "bTiRlDodVRVUvI5asAv5OrmPjdR2kQoL", "0F0kzsbgf", "9OhtkIX5JTQzZAf31yyS0L6RFdCICf7G", "a5UohLNEI7iVSyxaj4LiJgBVL6R7sy1L", "7foeJoxu0TAivWs2uWCvQbVxkZa0ERHH", "EHJaWrfXkxbvFmDXjSXoaOL8kiGJisUm", "EwwWMCMqNj"};
    public static final String A0E;
    public int A00;
    public C2221iB A01;
    public InterfaceC1381Me A02;
    public C1382Mf A03;
    public InterfaceC1594Uo A04;
    public List<C1480Qc> A05;
    public boolean A06;
    public boolean A07;
    public boolean A08;
    public boolean A09;
    public final C1937dL A0A;
    public final String A0B;

    public static String A02(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A0C, i10, i10 + i11);
        for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] ^ i12) ^ 27);
            if (A0D[0].length() != 31) {
                throw new RuntimeException();
            }
            String[] strArr = A0D;
            strArr[4] = "ypXQoKhxcHRWJrqojmqi5sMtZ7xfThaX";
            strArr[6] = "2LOy6kLjroQDrfbojOuFHdbjLd88ORkx";
        }
        return new String(bArrCopyOfRange);
    }

    public static void A04() {
        A0C = new byte[]{55, 18, 23, 6, 2, 19, 4, 86, 23, 26, 4, 19, 23, 18, 15, 86, 26, 25, 23, 18, 19, 18, 86, 18, 23, 2, 23, 2, 45, 40, 34, 42, 97, 41, 32, 49, 49, 36, 47, 36, 37, 97, 46, 47, 97, 45, 46, 34, 42, 50, 34, 51, 36, 36, 47, 97, 32, 37, 87, 120, 125, 119, AbstractJsonLexerKt.TC_INVALID, 52, 120, 123, 115, 115, 113, 112, 119, 117, 120, 120, 113, 102, 64, 109, 100, 113, 46, 44, Utf8.REPLACEMENT_BYTE, 41, 46, 35, 57, 85, 87, 68, 82, 95, 88, 82, 114, 101, 58, 53, 32, 61, 34, 49, 12, 17, 30, 15, 12, 23, 16, 11, 100, AbstractJsonLexerKt.TC_INVALID, 120, 96, 100, 116, 88, 117, 33, 62, 50, 32};
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: Index 7 out of bounds for length 7
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.startVar(DebugInfoParser.java:203)
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:135)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:122)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:638)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:38)
     */
    private void A06(Map<String, String> map, Map<String, String> map2) {
        try {
            new Handler().postDelayed(new C2234iO(this, map2, A03(map)), this.A01.A07() * 1000);
        } catch (Exception unused) {
        }
    }

    static {
        A04();
        A0E = C2233iN.class.getSimpleName();
    }

    public C2233iN(C1937dL c1937dL) {
        this(c1937dL, new C2221iB());
    }

    public C2233iN(C1937dL c1937dL, C2221iB c2221iB) {
        this.A0B = UUID.randomUUID().toString();
        this.A00 = 200;
        this.A01 = c2221iB;
        this.A0A = c1937dL;
    }

    private Map<String, String> A03(Map<String, String> map) {
        HashMap map2 = new HashMap();
        String strA02 = A02(Sdk.SDKError.Reason.PROTOBUF_SERIALIZATION_ERROR_VALUE, 4, 76);
        if (map.containsKey(strA02)) {
            map2.put(strA02, map.get(strA02));
        }
        String strA022 = A02(102, 8, 100);
        if (map.containsKey(strA022)) {
            map2.put(strA022, map.get(strA022));
        }
        return map2;
    }

    private void A05(C2221iB c2221iB) {
        if (!this.A06) {
            this.A01 = c2221iB;
            List<C2221iB> listA0c = this.A01.A0c();
            if (listA0c != null && listA0c.size() > 0) {
                int size = listA0c.size();
                ArrayList arrayList = new ArrayList(size);
                for (int i10 = 0; i10 < size; i10++) {
                    C2233iN adapter = new C2233iN(this.A0A);
                    adapter.A05(listA0c.get(i10));
                    arrayList.add(new C1480Qc(this.A0A, adapter, (TF) null, this.A04));
                }
                this.A05 = arrayList;
            }
            this.A06 = true;
            this.A07 = A07();
            return;
        }
        throw new IllegalStateException(A02(0, 27, 109));
    }

    private boolean A07() {
        return (!(this.A01.A0e() || TextUtils.isEmpty(this.A01.A0V())) || (!TextUtils.isEmpty(this.A01.A0S()) && this.A01.A0e())) && (this.A01.A0F() != null || this.A01.A0e()) && (this.A01.A0E() != null || A8c() == AdPlacementType.NATIVE_BANNER);
    }

    public final int A08() {
        return this.A01.A02();
    }

    public final int A09() {
        return this.A01.A05();
    }

    public final int A0A() {
        int iA06 = this.A01.A06();
        if (iA06 < 0 || iA06 > 100) {
            return 0;
        }
        return iA06;
    }

    public final int A0B() {
        return this.A00;
    }

    public final int A0C() {
        return this.A01.A08();
    }

    public final int A0D() {
        return this.A01.A09();
    }

    public final C2221iB A0E() {
        return this.A01;
    }

    public final InterfaceC1381Me A0F() {
        return this.A02;
    }

    public final String A0G() {
        return this.A01.A0Y();
    }

    public final List<C1480Qc> A0H() {
        if (!A0R()) {
            return null;
        }
        return this.A05;
    }

    public final void A0I() {
        if (!this.A09) {
            String strA0Z = A0E().A0Z();
            if (strA0Z != null) {
                US usA0A = this.A0A.A0A();
                String[] strArr = A0D;
                if (strArr[1].charAt(25) != strArr[3].charAt(25)) {
                    throw new RuntimeException();
                }
                String[] strArr2 = A0D;
                strArr2[4] = "MHNGbcOaMZIG61BxjY7eI95TuiNlx0Gr";
                strArr2[6] = "kvjKrlZQ6RBIZv1Jj5ESJw4vFB55PB3z";
                usA0A.AGF(strA0Z);
            }
            this.A09 = true;
        }
    }

    public final void A0J() {
        if (this.A05 != null && !this.A05.isEmpty()) {
            Iterator<C1480Qc> it = this.A05.iterator();
            while (it.hasNext()) {
                it.next().unregisterView();
            }
        }
    }

    public final void A0K(InterfaceC1381Me interfaceC1381Me) {
        this.A02 = interfaceC1381Me;
    }

    public final void A0L(C1937dL c1937dL, InterfaceC1381Me interfaceC1381Me, US us, NU nu2, InterfaceC1594Uo interfaceC1594Uo) {
        int iA06;
        this.A02 = interfaceC1381Me;
        this.A04 = interfaceC1594Uo;
        JSONObject jSONObjectA03 = nu2.A03();
        TF tfA01 = nu2.A01();
        if (tfA01 != null) {
            iA06 = tfA01.A06();
        } else {
            iA06 = 200;
        }
        this.A00 = iA06;
        A05(AbstractC1383Mg.A00(c1937dL, jSONObjectA03, AbstractC1646Wr.A02(jSONObjectA03, A02(94, 2, 10))));
        if (ML.A06(c1937dL, this, us)) {
            c1937dL.A0F().A4u();
            interfaceC1381Me.AEK(this, V1.A00(AdErrorType.NO_FILL));
        } else {
            if (interfaceC1381Me != null) {
                interfaceC1381Me.AEH(this);
            }
            this.A03 = new C1382Mf(c1937dL, this.A0B, this, interfaceC1381Me);
            this.A03.A02();
        }
    }

    public final void A0M(Map<String, String> extraData) {
        N3 n3A21;
        if (!A0R()) {
            return;
        }
        boolean shouldBlockLockscreenClicks = U7.A20(this.A0A);
        if (shouldBlockLockscreenClicks) {
            boolean shouldBlockLockscreenClicks2 = XQ.A03(extraData);
            if (shouldBlockLockscreenClicks2) {
                Log.e(A0E, A02(27, 31, 90));
                return;
            }
        }
        HashMap map = new HashMap();
        if (extraData != null) {
            map.putAll(extraData);
        }
        boolean shouldBlockLockscreenClicks3 = this.A01.A0e();
        if (shouldBlockLockscreenClicks3) {
            map.put(A02(87, 7, 45), String.valueOf(A0E().A04()));
            map.put(A02(80, 7, 86), String.valueOf(A0E().A03()));
        }
        map.put(A02(70, 10, 15), AdPlacementType.NATIVE.name());
        map.put(A02(110, 8, 10), this.A0B);
        C1937dL c1937dL = this.A0A;
        US usA0A = this.A0A.A0A();
        String strA7G = this.A01.A7G();
        Uri uriA0B = this.A01.A0B();
        if (this.A01.A0C() != null) {
            n3A21 = this.A01.A0C().A21();
        } else {
            n3A21 = null;
        }
        MH mhA00 = MI.A00(c1937dL, usA0A, strA7G, uriA0B, map, n3A21);
        ME meA0G = ME.A09;
        if (mhA00 != null) {
            meA0G = mhA00.A0G(null);
        }
        if (meA0G != ME.A06) {
            WX.A04(this.A0A, A02(58, 12, 15));
            if (this.A02 != null) {
                this.A02.AEG(this);
            }
        }
    }

    public final void A0N(Map<String, String> extraData) {
        this.A0A.A0A().AAs(this.A01.A7G(), extraData);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0105  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A0O(java.util.Map<java.lang.String, java.lang.String> r9) {
        /*
            Method dump skipped, instructions count: 268
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.core.C2233iN.A0O(java.util.Map):void");
    }

    public final boolean A0P() {
        return true;
    }

    public final boolean A0Q() {
        return A0R() && this.A01.A0B() != null;
    }

    public final boolean A0R() {
        return this.A06 && this.A07;
    }

    public final boolean A0S() {
        return this.A01.A0d();
    }

    public final boolean A0T() {
        return U7.A1W(this.A0A) && A0R() && this.A01.A0f();
    }

    public final boolean A0U() {
        return U7.A1W(this.A0A) && A0R() && this.A01.A0g();
    }

    @Override // com.facebook.ads.redexgen.core.MK
    public final String A7G() {
        return this.A01.A7G();
    }

    @Override // com.facebook.ads.redexgen.core.MK
    public final Collection<String> A7h() {
        return A0E().A7h();
    }

    @Override // com.facebook.ads.redexgen.core.MK
    public final MJ A8C() {
        return A0E().A8C();
    }

    public AdPlacementType A8c() {
        return AdPlacementType.NATIVE;
    }

    @Override // com.facebook.ads.redexgen.core.MP
    public final boolean AJa() {
        return false;
    }

    @Override // com.facebook.ads.redexgen.core.MP
    public final void onDestroy() {
        if (this.A03 != null) {
            C1382Mf c1382Mf = this.A03;
            String[] strArr = A0D;
            if (strArr[4].charAt(16) != strArr[6].charAt(16)) {
                throw new RuntimeException();
            }
            A0D[7] = "xLZjaQWgus";
            c1382Mf.A03();
        }
    }
}
