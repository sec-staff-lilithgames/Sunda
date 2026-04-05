package com.ironsource.adqualitysdk.sdk.i;

import android.content.Context;
import android.graphics.Color;
import android.os.Handler;
import android.os.Looper;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import com.explorestack.protobuf.openrtb.LossReason;
import com.ironsource.adqualitysdk.sdk.ISAdQualityAdType;
import com.ironsource.adqualitysdk.sdk.i.kc;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.mbridge.msdk.playercommon.exoplayer2.extractor.ts.PsExtractor;
import com.vungle.ads.internal.protos.Sdk;
import io.ktor.util.date.GMTDateParser;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public abstract class aq extends AnonymousClass1 {

    /* renamed from: ﻐ, reason: contains not printable characters */
    private static aq f548;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    /* renamed from: com.ironsource.adqualitysdk.sdk.i.aq$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {

        /* renamed from: ｋ, reason: contains not printable characters */
        private JSONObject f549;

        /* renamed from: ﾒ, reason: contains not printable characters */
        private ax f550;

        /* renamed from: く, reason: contains not printable characters */
        public final ax m848() {
            return this.f550;
        }

        /* renamed from: っ, reason: contains not printable characters */
        public final synchronized JSONObject m849() {
            return this.f549;
        }

        /* renamed from: ﾇ, reason: contains not printable characters */
        public final void m850(ax axVar) {
            this.f550 = axVar;
        }

        /* renamed from: ﾒ, reason: contains not printable characters */
        public synchronized void mo851(JSONObject jSONObject) {
            this.f549 = jSONObject;
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public interface a {
        /* renamed from: ﻛ, reason: contains not printable characters */
        void mo852();

        /* renamed from: ﾇ, reason: contains not printable characters */
        void mo853();
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static class e extends aq {

        /* renamed from: リ, reason: contains not printable characters */
        private static int f551 = 1;

        /* renamed from: ヮ, reason: contains not printable characters */
        private static int f552;

        /* renamed from: ヶ, reason: contains not printable characters */
        private boolean f555;

        /* renamed from: 爫, reason: contains not printable characters */
        private boolean f556;

        /* renamed from: ﬤ, reason: contains not printable characters */
        private int f557;

        /* renamed from: טּ, reason: contains not printable characters */
        private ak f558;

        /* renamed from: סּ, reason: contains not printable characters */
        private boolean f559;

        /* renamed from: ףּ, reason: contains not printable characters */
        private List f560;

        /* renamed from: ﭖ, reason: contains not printable characters */
        private at f561;

        /* renamed from: ﭴ, reason: contains not printable characters */
        private List<at> f562;

        /* renamed from: ﭸ, reason: contains not printable characters */
        private List<at> f563;

        /* renamed from: ﮉ, reason: contains not printable characters */
        private a f564;

        /* renamed from: ﮌ, reason: contains not printable characters */
        private ao f565;

        /* renamed from: ﮐ, reason: contains not printable characters */
        private Handler f566;

        /* renamed from: ﱟ, reason: contains not printable characters */
        private av f567;

        /* renamed from: ﱡ, reason: contains not printable characters */
        private ap f568;

        /* renamed from: ﺙ, reason: contains not printable characters */
        private iy f569;

        /* renamed from: ﻏ, reason: contains not printable characters */
        private ar f570;

        /* renamed from: ﻐ, reason: contains not printable characters */
        private final int f571;

        /* renamed from: ﻛ, reason: contains not printable characters */
        private final int f572;

        /* renamed from: ｋ, reason: contains not printable characters */
        private jb f573;

        /* renamed from: ﾇ, reason: contains not printable characters */
        private final int f574;

        /* renamed from: ﾒ, reason: contains not printable characters */
        private final int f575;

        /* renamed from: 乁, reason: contains not printable characters */
        private static char[] f554 = {';', 'r', 'i', AbstractJsonLexerKt.BEGIN_OBJ, 247, 252, '3', 'e', 'k', 'p', '7', 'k', 'g', 'j', AbstractJsonLexerKt.COLON, 'j', 'a', 'k', '@', 135, 139, '9', 'j', 'i', 'r', '3', 'g', GMTDateParser.HOURS, GMTDateParser.MINUTES, GMTDateParser.SECONDS, 'i', 'b', GMTDateParser.DAY_OF_MONTH, 'c', 'a', 'b', 'g', 'L', 'L', 'p', 'R', 'I', 'c', 'H', 'P', 'k', 'i', 'n', 'q', 'l', GMTDateParser.DAY_OF_MONTH, 'i', 'n', '`', 191, 189, 188, 186, 180, 149, 158, 186, 178, 184, 185, 186, 158, '~', 161, 184, 183, 188, 184, '9', 'j', 'i', 'n', 'j', 'g', GMTDateParser.HOURS, 'J', 'H', 'b', 'b', 'e', 'f', ')', AbstractJsonLexerKt.BEGIN_LIST, 'i', 'n', 'q', 'l', 'T', GMTDateParser.YEAR, 'n', 'j', 'g', GMTDateParser.HOURS, 'G', 165, 188, 186, 186, 147, 139, 180, 181, 173, 180, 184, 181, 180, 141, 139, 171, 180, 182, 140, 140, 183, 183, 179, 187, AbstractJsonLexerKt.COLON, 'n', 'k', 'k', '2', 'j', 'r', 138, 270, 263, '0', 'b', GMTDateParser.DAY_OF_MONTH, 'l', 'v', 238, 230, 297, 278, 280, 'y', 264, 287, 285, 285, 246, 241, 280, 244, 240, 275, 281, 264, 262, 283, 283, 278, 273, 280, 286, 285, 287, 272, 270, 262, 259, 283, 279, 270, 276, 277, '6', GMTDateParser.MINUTES, 'n', 'j', 'J', 'G', 'b', 'j', 'O', GMTDateParser.MONTH, 'f', 'j', GMTDateParser.SECONDS, AbstractJsonLexerKt.BEGIN_LIST, GMTDateParser.YEAR, 'n', 'n', 'i', GMTDateParser.DAY_OF_MONTH, 'k', 'q', 'p', 'c', 'b', 'j', 'b', 'j', 'l', AbstractJsonLexerKt.STRING_ESC, '^', 'k', 'i', 'l', GMTDateParser.SECONDS, 'j', 'g', 'n', 153, 307, 307, 297, 293, 302};

        /* renamed from: 丫, reason: contains not printable characters */
        private static int[] f553 = {1356832937, 194551326, -797996867, 93998518, -238452070, 1616176177, 1400581063, 1733771752, -480608407, 485696894, -150383125, 43900332, -744392826, 943419649, 351540760, 1923284178, 857534579, 63360855};

        public e() {
            super((byte) 0);
            m866("\u0000\u0000\u0001", true, new int[]{0, 3, 0, 0}).intern();
            m866("\u0001\u0001\u0000", false, new int[]{3, 3, 147, 1}).intern();
            m866("\u0001\u0000\u0001\u0000", true, new int[]{6, 4, 0, 2}).intern();
            m871(new int[]{654859020, -1475791147}, AndroidCharacter.getMirror('0') - ',').intern();
            m866("\u0000\u0001\u0000\u0001", false, new int[]{10, 4, 0, 0}).intern();
            m866("\u0000\u0001\u0001\u0000", true, new int[]{14, 4, 0, 2}).intern();
            m871(new int[]{-1761020864, -1641972423}, 5 - (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1))).intern();
            m866("\u0000\u0001\u0001", false, new int[]{18, 3, 28, 1}).intern();
            m866("\u0001\u0000\u0000\u0000", false, new int[]{21, 4, 0, 4}).intern();
            TimeUnit timeUnit = TimeUnit.HOURS;
            timeUnit.toMillis(24L);
            TimeUnit timeUnit2 = TimeUnit.SECONDS;
            this.f575 = (int) timeUnit2.toMillis(5L);
            this.f572 = (int) timeUnit.toMillis(12L);
            this.f574 = (int) timeUnit2.toMillis(3L);
            this.f571 = (int) timeUnit2.toMillis(10L);
            this.f557 = 0;
            this.f560 = null;
            this.f555 = false;
        }

        /* renamed from: Ύ, reason: contains not printable characters */
        private int m854() {
            f551 = (f552 + 7) % 128;
            int iOptInt = m849().optInt(m871(new int[]{1814862327, 1168861348}, AndroidCharacter.getMirror('0') - ',').intern(), 3);
            int i10 = f551 + 83;
            f552 = i10 % 128;
            if (i10 % 2 == 0) {
                return iOptInt;
            }
            throw null;
        }

        /* renamed from: K, reason: contains not printable characters */
        private JSONObject m855() {
            String strM2921;
            int i10 = f552 + 25;
            f551 = i10 % 128;
            if (i10 % 2 != 0 ? (strM2921 = this.f573.m2921(m866("\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0000\u0000\u0001\u0001", false, new int[]{73, 13, 0, 0}).intern())) != null : (strM2921 = this.f573.m2921(m866("\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0000\u0000\u0001\u0001", false, new int[]{73, 13, 0, 0}).intern())) != null) {
                try {
                    JSONObject jSONObject = new JSONObject(strM2921);
                    f551 = (f552 + 69) % 128;
                    return jSONObject;
                } catch (JSONException unused) {
                }
            }
            return new JSONObject();
        }

        /* renamed from: Ⅽ, reason: contains not printable characters */
        private synchronized void m856() {
            int i10 = f552 + 65;
            f551 = i10 % 128;
            if (i10 % 2 == 0) {
                throw null;
            }
            Handler handler = this.f566;
            if (handler != null) {
                handler.post(new iu() { // from class: com.ironsource.adqualitysdk.sdk.i.aq.e.3
                    @Override // com.ironsource.adqualitysdk.sdk.i.iu
                    /* renamed from: ﻐ */
                    public final void mo590() {
                        e.this.m877(true);
                        if (e.m858(e.this) != null) {
                            e.m858(e.this).mo667();
                        }
                        Iterator it = new ArrayList(e.m861(e.this)).iterator();
                        while (it.hasNext()) {
                            ((at) it.next()).mo667();
                        }
                        e.m861(e.this).clear();
                        Iterator it2 = new ArrayList(e.m864(e.this)).iterator();
                        while (it2.hasNext()) {
                            ((at) it2.next()).mo667();
                        }
                    }
                });
                f552 = (f551 + 107) % 128;
            }
        }

        /* renamed from: ﮐ, reason: contains not printable characters */
        public static /* synthetic */ int m857(e eVar) {
            f551 = (f552 + 17) % 128;
            int iM854 = eVar.m854();
            f552 = (f551 + 79) % 128;
            return iM854;
        }

        /* renamed from: ﱡ, reason: contains not printable characters */
        public static /* synthetic */ at m858(e eVar) {
            int i10 = f552;
            f551 = (i10 + 67) % 128;
            at atVar = eVar.f561;
            int i11 = i10 + 11;
            f551 = i11 % 128;
            if (i11 % 2 != 0) {
                return atVar;
            }
            throw null;
        }

        /* renamed from: ﺙ, reason: contains not printable characters */
        public static /* synthetic */ Handler m859(e eVar) {
            int i10 = f551 + 53;
            int i11 = i10 % 128;
            f552 = i11;
            int i12 = i10 % 2;
            Handler handler = eVar.f566;
            if (i12 != 0) {
                throw null;
            }
            f551 = (i11 + 83) % 128;
            return handler;
        }

        /* renamed from: ﻏ, reason: contains not printable characters */
        public static /* synthetic */ int m860(e eVar) {
            int i10 = f552;
            f551 = (i10 + 83) % 128;
            int i11 = eVar.f557;
            eVar.f557 = i11 + 1;
            f551 = (i10 + Sdk.SDKError.Reason.JSON_ENCODE_ERROR_VALUE) % 128;
            return i11;
        }

        /* renamed from: ﻐ, reason: contains not printable characters */
        public static /* synthetic */ List m861(e eVar) {
            int i10 = f551 + 107;
            f552 = i10 % 128;
            int i11 = i10 % 2;
            List<at> list = eVar.f562;
            if (i11 == 0) {
                return list;
            }
            throw null;
        }

        /* renamed from: ﻛ, reason: contains not printable characters */
        public static /* synthetic */ List m864(e eVar) {
            int i10 = f552 + 65;
            int i11 = i10 % 128;
            f551 = i11;
            int i12 = i10 % 2;
            List<at> list = eVar.f563;
            if (i12 == 0) {
                int i13 = 41 / 0;
            }
            f552 = (i11 + 91) % 128;
            return list;
        }

        /* renamed from: ｋ, reason: contains not printable characters */
        public static /* synthetic */ void m867(e eVar) {
            f551 = (f552 + 29) % 128;
            eVar.m856();
            f552 = (f551 + 75) % 128;
        }

        /* renamed from: ﾇ, reason: contains not printable characters */
        public static /* synthetic */ a m869(e eVar) {
            int i10 = f551 + 75;
            f552 = i10 % 128;
            int i11 = i10 % 2;
            a aVar = eVar.f564;
            if (i11 == 0) {
                return aVar;
            }
            throw null;
        }

        /* renamed from: ﾒ, reason: contains not printable characters */
        public static /* synthetic */ jb m873(e eVar) {
            int i10 = f552 + 51;
            f551 = i10 % 128;
            int i11 = i10 % 2;
            jb jbVar = eVar.f573;
            if (i11 != 0) {
                return jbVar;
            }
            throw null;
        }

        /* renamed from: へ, reason: contains not printable characters */
        public final synchronized iy m874() {
            iy iyVar;
            int i10 = (f551 + 105) % 128;
            f552 = i10;
            iyVar = this.f569;
            f551 = (i10 + 53) % 128;
            return iyVar;
        }

        /* renamed from: ゥ, reason: contains not printable characters */
        public final int m875() {
            f551 = (f552 + 85) % 128;
            int iOptInt = m849().optInt(m866(null, true, new int[]{140, 3, 181, 3}).intern(), this.f572);
            int i10 = f551 + 81;
            f552 = i10 % 128;
            if (i10 % 2 == 0) {
                return iOptInt;
            }
            throw null;
        }

        /* renamed from: ト, reason: contains not printable characters */
        public final int m876() {
            f551 = (f552 + Sdk.SDKError.Reason.TPAT_ERROR_VALUE) % 128;
            int iOptInt = m849().optInt(m866("\u0001\u0000\u0001", false, new int[]{Sdk.SDKError.Reason.TPAT_RETRY_FAILED_VALUE, 3, Sdk.SDKError.Reason.INVALID_RI_ENDPOINT_VALUE, 2}).intern(), this.f575);
            int i10 = f552 + 21;
            f551 = i10 % 128;
            if (i10 % 2 != 0) {
                return iOptInt;
            }
            throw null;
        }

        @Override // com.ironsource.adqualitysdk.sdk.i.aq
        /* renamed from: リ */
        public final List mo815() {
            f551 = (f552 + 87) % 128;
            if (this.f560 == null) {
                this.f560 = kc.m3192(m849().optJSONArray(m866("\u0000\u0001\u0001\u0000", true, new int[]{14, 4, 0, 2}).intern()), new kc.c<ISAdQualityAdType>() { // from class: com.ironsource.adqualitysdk.sdk.i.aq.e.8
                    @Override // com.ironsource.adqualitysdk.sdk.i.kc.c
                    /* renamed from: ｋ, reason: contains not printable characters */
                    public final /* synthetic */ ISAdQualityAdType mo883(JSONArray jSONArray, int i10) {
                        return ISAdQualityAdType.fromInt(jSONArray.optInt(i10));
                    }
                });
                f552 = (f551 + 47) % 128;
            }
            return this.f560;
        }

        @Override // com.ironsource.adqualitysdk.sdk.i.aq
        /* renamed from: ヮ */
        public final boolean mo816() {
            f552 = (f551 + 95) % 128;
            boolean zOptBoolean = m849().optBoolean(m866("\u0001\u0000\u0000\u0000", false, new int[]{21, 4, 0, 4}).intern());
            f551 = (f552 + 51) % 128;
            return zOptBoolean;
        }

        @Override // com.ironsource.adqualitysdk.sdk.i.aq
        /* renamed from: ヶ */
        public final long mo817() throws NumberFormatException {
            f551 = (f552 + 93) % 128;
            String strM2921 = this.f573.m2921(m866("\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u0001\u0000\u0001", false, new int[]{174, 37, 0, 0}).intern());
            if (TextUtils.isEmpty(strM2921)) {
                return 0L;
            }
            long j10 = Long.parseLong(strM2921);
            f552 = (f551 + 59) % 128;
            return j10;
        }

        @Override // com.ironsource.adqualitysdk.sdk.i.aq
        /* renamed from: 丫 */
        public final int mo818() {
            int iOptInt;
            synchronized (this) {
                iOptInt = m849().optInt(m866("\u0000\u0001\u0001", false, new int[]{18, 3, 28, 1}).intern(), 100);
            }
            return iOptInt;
        }

        @Override // com.ironsource.adqualitysdk.sdk.i.aq
        /* renamed from: 乁 */
        public final boolean mo819() {
            JSONObject jSONObjectM849;
            String strM871;
            int i10 = f552 + 49;
            f551 = i10 % 128;
            if (i10 % 2 == 0) {
                jSONObjectM849 = m849();
                strM871 = m871(new int[]{-1761020864, -1641972423}, 2 / (ViewConfiguration.getKeyRepeatDelay() >>> 75));
            } else {
                jSONObjectM849 = m849();
                strM871 = m871(new int[]{-1761020864, -1641972423}, (ViewConfiguration.getKeyRepeatDelay() >> 16) + 4);
            }
            boolean zOptBoolean = jSONObjectM849.optBoolean(strM871.intern());
            int i11 = f551 + 89;
            f552 = i11 % 128;
            if (i11 % 2 == 0) {
                return zOptBoolean;
            }
            throw null;
        }

        @Override // com.ironsource.adqualitysdk.sdk.i.aq
        /* renamed from: 爫 */
        public final JSONObject mo820() {
            int i10 = f551 + 61;
            f552 = i10 % 128;
            if (i10 % 2 != 0) {
                m848();
                throw null;
            }
            if (m848() == null) {
                return null;
            }
            JSONObject jSONObjectM1016 = m848().m1016();
            f552 = (f551 + 107) % 128;
            return jSONObjectM1016;
        }

        @Override // com.ironsource.adqualitysdk.sdk.i.aq
        /* renamed from: ﬤ */
        public final int mo821() {
            f552 = (f551 + 17) % 128;
            int iOptInt = m849().optInt(m866("\u0001\u0000\u0001\u0000", true, new int[]{6, 4, 0, 2}).intern(), this.f574);
            f551 = (f552 + 107) % 128;
            return iOptInt;
        }

        /* JADX WARN: Code restructure failed: missing block: B:10:0x0044, code lost:
        
            if (android.text.TextUtils.isEmpty(r0) == false) goto L17;
         */
        /* JADX WARN: Code restructure failed: missing block: B:11:0x0046, code lost:
        
            r0 = com.ironsource.adqualitysdk.sdk.i.aq.e.f551 + 45;
            com.ironsource.adqualitysdk.sdk.i.aq.e.f552 = r0 % 128;
         */
        /* JADX WARN: Code restructure failed: missing block: B:12:0x0050, code lost:
        
            if ((r0 % 2) != 0) goto L15;
         */
        /* JADX WARN: Code restructure failed: missing block: B:14:0x005a, code lost:
        
            return m848().m1015();
         */
        /* JADX WARN: Code restructure failed: missing block: B:15:0x005b, code lost:
        
            m848().m1015();
         */
        /* JADX WARN: Code restructure failed: missing block: B:16:0x0062, code lost:
        
            throw null;
         */
        /* JADX WARN: Code restructure failed: missing block: B:17:0x0063, code lost:
        
            return r0;
         */
        /* JADX WARN: Code restructure failed: missing block: B:18:0x0064, code lost:
        
            return null;
         */
        /* JADX WARN: Code restructure failed: missing block: B:5:0x0015, code lost:
        
            if (m849() != null) goto L9;
         */
        /* JADX WARN: Code restructure failed: missing block: B:8:0x001c, code lost:
        
            if (m849() != null) goto L9;
         */
        /* JADX WARN: Code restructure failed: missing block: B:9:0x001e, code lost:
        
            r0 = m849().optString(m871(new int[]{626791679, -1146225870}, (android.view.ViewConfiguration.getTouchSlop() >> 8) + 4).intern());
         */
        @Override // com.ironsource.adqualitysdk.sdk.i.aq
        /* renamed from: טּ */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.String mo822() {
            /*
                r4 = this;
                int r0 = com.ironsource.adqualitysdk.sdk.i.aq.e.f551
                int r0 = r0 + 89
                int r1 = r0 % 128
                com.ironsource.adqualitysdk.sdk.i.aq.e.f552 = r1
                int r0 = r0 % 2
                r1 = 0
                if (r0 == 0) goto L18
                org.json.JSONObject r0 = r4.m849()
                r2 = 16
                int r2 = r2 / 0
                if (r0 == 0) goto L64
                goto L1e
            L18:
                org.json.JSONObject r0 = r4.m849()
                if (r0 == 0) goto L64
            L1e:
                org.json.JSONObject r0 = r4.m849()
                r2 = 626791679(0x255c14ff, float:1.9089072E-16)
                r3 = -1146225870(0xffffffffbbadfb32, float:-0.005309486)
                int[] r2 = new int[]{r2, r3}
                int r3 = android.view.ViewConfiguration.getTouchSlop()
                int r3 = r3 >> 8
                int r3 = r3 + 4
                java.lang.String r2 = m871(r2, r3)
                java.lang.String r2 = r2.intern()
                java.lang.String r0 = r0.optString(r2)
                boolean r2 = android.text.TextUtils.isEmpty(r0)
                if (r2 == 0) goto L63
                int r0 = com.ironsource.adqualitysdk.sdk.i.aq.e.f551
                int r0 = r0 + 45
                int r2 = r0 % 128
                com.ironsource.adqualitysdk.sdk.i.aq.e.f552 = r2
                int r0 = r0 % 2
                if (r0 != 0) goto L5b
                com.ironsource.adqualitysdk.sdk.i.ax r0 = r4.m848()
                java.lang.String r0 = r0.m1015()
                return r0
            L5b:
                com.ironsource.adqualitysdk.sdk.i.ax r0 = r4.m848()
                r0.m1015()
                throw r1
            L63:
                return r0
            L64:
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ironsource.adqualitysdk.sdk.i.aq.e.mo822():java.lang.String");
        }

        @Override // com.ironsource.adqualitysdk.sdk.i.aq
        /* renamed from: סּ */
        public final synchronized void mo823() {
            this.f566.removeCallbacksAndMessages(null);
            this.f566 = null;
            p.m3251(new iu() { // from class: com.ironsource.adqualitysdk.sdk.i.aq.e.1
                @Override // com.ironsource.adqualitysdk.sdk.i.iu
                /* renamed from: ﻐ */
                public final void mo590() {
                    e.m861(e.this).clear();
                    e.m864(e.this).clear();
                    e.m870(e.this, (at) null);
                }
            });
            int i10 = f552 + 101;
            f551 = i10 % 128;
            if (i10 % 2 == 0) {
                throw null;
            }
        }

        @Override // com.ironsource.adqualitysdk.sdk.i.aq
        /* renamed from: ףּ */
        public final int mo824() {
            JSONObject jSONObjectM849;
            String strM871;
            int i10 = f552 + 45;
            f551 = i10 % 128;
            if (i10 % 2 == 0) {
                jSONObjectM849 = m849();
                strM871 = m871(new int[]{654859020, -1475791147}, 5 << (ViewConfiguration.getKeyRepeatDelay() * 68));
            } else {
                jSONObjectM849 = m849();
                strM871 = m871(new int[]{654859020, -1475791147}, 4 - (ViewConfiguration.getKeyRepeatDelay() >> 16));
            }
            int iOptInt = jSONObjectM849.optInt(strM871.intern(), this.f571);
            int i11 = f551 + 69;
            f552 = i11 % 128;
            if (i11 % 2 != 0) {
                int i12 = 32 / 0;
            }
            return iOptInt;
        }

        @Override // com.ironsource.adqualitysdk.sdk.i.aq
        /* renamed from: ﭖ */
        public final ao mo825() {
            int i10 = f551;
            ao aoVar = this.f565;
            int i11 = i10 + 31;
            f552 = i11 % 128;
            if (i11 % 2 == 0) {
                return aoVar;
            }
            throw null;
        }

        @Override // com.ironsource.adqualitysdk.sdk.i.aq
        /* renamed from: ﭴ */
        public final String mo826() {
            f552 = (f551 + 37) % 128;
            String strOptString = m849().optString(m866("\u0000\u0000\u0001", true, new int[]{0, 3, 0, 0}).intern());
            int i10 = f551 + 97;
            f552 = i10 % 128;
            if (i10 % 2 == 0) {
                return strOptString;
            }
            throw null;
        }

        @Override // com.ironsource.adqualitysdk.sdk.i.aq
        /* renamed from: ﭸ */
        public final ap mo827() {
            int i10 = f552;
            ap apVar = this.f568;
            f551 = (i10 + 105) % 128;
            return apVar;
        }

        @Override // com.ironsource.adqualitysdk.sdk.i.aq
        /* renamed from: ﮉ */
        public final ar mo828() {
            int i10 = f552 + 51;
            f551 = i10 % 128;
            if (i10 % 2 != 0) {
                return this.f570;
            }
            throw null;
        }

        @Override // com.ironsource.adqualitysdk.sdk.i.aq
        /* renamed from: ﮌ */
        public final av mo829() {
            int i10 = f551;
            av avVar = this.f567;
            int i11 = i10 + 83;
            f552 = i11 % 128;
            if (i11 % 2 == 0) {
                return avVar;
            }
            throw null;
        }

        @Override // com.ironsource.adqualitysdk.sdk.i.aq
        /* renamed from: ﱟ */
        public final int mo831() {
            ax axVarM848;
            int i10 = f551 + 95;
            f552 = i10 % 128;
            if (i10 % 2 != 0) {
                axVarM848 = m848();
                if (axVarM848 == null) {
                    return 31595;
                }
            } else {
                axVarM848 = m848();
                if (axVarM848 == null) {
                    return IronSourceError.ERROR_CAPPING_VALIDATION_FAILED;
                }
            }
            int iM1014 = axVarM848.m1014();
            f551 = (f552 + 109) % 128;
            return iM1014;
        }

        /* renamed from: ﻛ, reason: contains not printable characters */
        private static void m865(JSONObject jSONObject) {
            f552 = (f551 + 113) % 128;
            kc.m3194(jSONObject, jSONObject.optJSONObject(m866("\u0001\u0001\u0000\u0001\u0000\u0001", false, new int[]{LossReason.LOSS_REASON_CREATIVE_FILTERED_ANIMATION_TOO_LONG_VALUE, 6, PsExtractor.AUDIO_STREAM, 1}).intern()));
            f552 = (f551 + Sdk.SDKError.Reason.TPAT_ERROR_VALUE) % 128;
        }

        /* renamed from: ｋ, reason: contains not printable characters */
        public static /* synthetic */ void m868(JSONObject jSONObject, long j10) throws JSONException {
            int i10 = f551 + 57;
            f552 = i10 % 128;
            int i11 = i10 % 2;
            m862(jSONObject, j10);
            if (i11 != 0) {
                throw null;
            }
            int i12 = f551 + 97;
            f552 = i12 % 128;
            if (i12 % 2 != 0) {
                throw null;
            }
        }

        /* renamed from: ﾇ, reason: contains not printable characters */
        public static /* synthetic */ at m870(e eVar, at atVar) {
            int i10 = (f551 + 29) % 128;
            f552 = i10;
            eVar.f561 = atVar;
            int i11 = i10 + Sdk.SDKError.Reason.TPAT_ERROR_VALUE;
            f551 = i11 % 128;
            if (i11 % 2 != 0) {
                return atVar;
            }
            throw null;
        }

        @Override // com.ironsource.adqualitysdk.sdk.i.aq
        /* renamed from: ﮐ */
        public final synchronized boolean mo830() {
            boolean z10;
            int i10 = f552;
            int i11 = i10 + 85;
            f551 = i11 % 128;
            if (i11 % 2 == 0) {
                throw null;
            }
            z10 = this.f556;
            int i12 = i10 + 85;
            f551 = i12 % 128;
            if (i12 % 2 == 0) {
                throw null;
            }
            return z10;
        }

        @Override // com.ironsource.adqualitysdk.sdk.i.aq
        /* renamed from: ﱡ */
        public final boolean mo832() {
            int i10 = f551;
            boolean z10 = this.f559;
            int i11 = i10 + 99;
            f552 = i11 % 128;
            if (i11 % 2 == 0) {
                return z10;
            }
            throw null;
        }

        @Override // com.ironsource.adqualitysdk.sdk.i.aq
        /* renamed from: ﺙ */
        public final double mo833() throws UnsupportedEncodingException {
            JSONObject jSONObjectM849;
            String strM866;
            int i10 = f551 + 73;
            f552 = i10 % 128;
            if (i10 % 2 != 0) {
                jSONObjectM849 = m849();
                strM866 = m866("\u0001\u0001\u0000", false, new int[]{127, 3, 0, 2});
            } else {
                jSONObjectM849 = m849();
                strM866 = m866("\u0001\u0001\u0000", false, new int[]{127, 3, 0, 2});
            }
            return jSONObjectM849.optDouble(strM866.intern(), 5.0d);
        }

        @Override // com.ironsource.adqualitysdk.sdk.i.aq
        /* renamed from: ﻏ */
        public final double mo834() {
            f552 = (f551 + 71) % 128;
            double dOptDouble = m849().optDouble(m866("\u0000\u0001\u0000\u0001", false, new int[]{10, 4, 0, 0}).intern(), 1.0d);
            f552 = (f551 + 19) % 128;
            return dOptDouble;
        }

        /* renamed from: ﻐ, reason: contains not printable characters */
        public final synchronized void m877(boolean z10) {
            int i10 = (f551 + 31) % 128;
            f552 = i10;
            this.f556 = z10;
            int i11 = i10 + 87;
            f551 = i11 % 128;
            if (i11 % 2 == 0) {
                throw null;
            }
        }

        @Override // com.ironsource.adqualitysdk.sdk.i.aq
        /* renamed from: ﾒ */
        public final void mo846(Context context, iy iyVar, ak akVar, a aVar, boolean z10) {
            this.f573 = new jb(context, m866("\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0000\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0000\u0000\u0001\u0000\u0000\u0001\u0001\u0000\u0000\u0001", false, new int[]{25, 28, 0, 3}).intern(), m866("\u0001\u0000\u0000\u0000\u0001\u0001\u0000\u0000\u0000\u0000\u0001\u0001\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u0000", false, new int[]{53, 20, 78, 0}).intern());
            this.f569 = iyVar;
            this.f556 = false;
            this.f559 = z10;
            this.f558 = akVar;
            this.f566 = new Handler(Looper.getMainLooper());
            ax axVar = new ax();
            this.f567 = new av(axVar);
            this.f570 = new ar(axVar);
            this.f568 = new ap(axVar);
            this.f565 = new ao();
            mo851(m855());
            m850(axVar);
            this.f564 = aVar;
            this.f562 = new ArrayList();
            this.f563 = new ArrayList();
            int i10 = f552 + 25;
            f551 = i10 % 128;
            if (i10 % 2 == 0) {
                throw null;
            }
        }

        /* renamed from: ﻛ, reason: contains not printable characters */
        private au m863(String str) {
            f552 = (f551 + 79) % 128;
            if (str == null) {
                return null;
            }
            au auVar = mo841().get(str);
            int i10 = f552 + 45;
            f551 = i10 % 128;
            if (i10 % 2 == 0) {
                int i11 = 93 / 0;
            }
            return auVar;
        }

        @Override // com.ironsource.adqualitysdk.sdk.i.aq
        /* renamed from: ﻐ */
        public final void mo836(iw iwVar) {
            int i10 = f552 + 79;
            f551 = i10 % 128;
            if (i10 % 2 != 0) {
                m848().m1022(iwVar);
            } else {
                m848().m1022(iwVar);
                throw null;
            }
        }

        @Override // com.ironsource.adqualitysdk.sdk.i.aq
        /* renamed from: ｋ */
        public final void mo839(JSONObject jSONObject) {
            f551 = (f552 + 109) % 128;
            mo851(jSONObject);
            m856();
            f552 = (f551 + 57) % 128;
        }

        /* JADX WARN: Removed duplicated region for block: B:8:0x0015  */
        @Override // com.ironsource.adqualitysdk.sdk.i.aq
        /* renamed from: ﾇ */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final void mo842(final android.content.Context r8, final com.ironsource.adqualitysdk.sdk.i.as r9, boolean r10) {
            /*
                r7 = this;
                int r0 = com.ironsource.adqualitysdk.sdk.i.aq.e.f552
                int r0 = r0 + 83
                int r1 = r0 % 128
                com.ironsource.adqualitysdk.sdk.i.aq.e.f551 = r1
                int r0 = r0 % 2
                r1 = 0
                if (r0 != 0) goto L13
                r0 = 36
                int r0 = r0 / r1
                if (r10 == 0) goto L26
                goto L15
            L13:
                if (r10 == 0) goto L26
            L15:
                com.ironsource.adqualitysdk.sdk.i.aq$e$4 r10 = new com.ironsource.adqualitysdk.sdk.i.aq$e$4
                r10.<init>()
                com.ironsource.adqualitysdk.sdk.i.aq r0 = com.ironsource.adqualitysdk.sdk.i.aq.m814()
                int r0 = r0.mo821()
                long r2 = (long) r0
                com.ironsource.adqualitysdk.sdk.i.p.m3254(r10, r2)
            L26:
                r7.m877(r1)
                org.json.JSONObject r10 = new org.json.JSONObject
                r10.<init>()
                r0 = 1
                com.ironsource.adqualitysdk.sdk.i.jr r2 = new com.ironsource.adqualitysdk.sdk.i.jr     // Catch: org.json.JSONException -> L4e
                long r3 = r7.mo817()     // Catch: org.json.JSONException -> L4e
                r2.<init>(r8, r9, r3)     // Catch: org.json.JSONException -> L4e
                org.json.JSONObject r3 = new org.json.JSONObject     // Catch: org.json.JSONException -> L4e
                r3.<init>()     // Catch: org.json.JSONException -> L4e
                com.ironsource.adqualitysdk.sdk.i.iy r4 = r7.m874()     // Catch: org.json.JSONException -> L4e
                com.ironsource.adqualitysdk.sdk.i.iv r4 = r4.m2895()     // Catch: org.json.JSONException -> L4e
                boolean r4 = r4.m2855()     // Catch: org.json.JSONException -> L4e
                org.json.JSONObject r10 = r2.mo676(r3, r4, r0, r1)     // Catch: org.json.JSONException -> L4e
                goto L78
            L4e:
                r2 = move-exception
                r3 = 86
                r4 = 12
                int[] r3 = new int[]{r3, r4, r1, r1}
                java.lang.String r4 = "\u0000\u0001\u0000\u0000\u0001\u0001\u0000\u0000\u0001\u0000\u0001\u0000"
                java.lang.String r3 = m866(r4, r1, r3)
                java.lang.String r3 = r3.intern()
                r4 = 25
                r5 = 74
                r6 = 98
                int[] r4 = new int[]{r6, r4, r5, r1}
                java.lang.String r5 = "\u0001\u0001\u0000\u0001\u0001\u0000\u0001\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0001\u0000"
                java.lang.String r4 = m866(r5, r1, r4)
                java.lang.String r4 = r4.intern()
                com.ironsource.adqualitysdk.sdk.i.k.m3145(r3, r4, r2)
            L78:
                com.ironsource.adqualitysdk.sdk.i.iy r2 = r7.m874()
                com.ironsource.adqualitysdk.sdk.i.ak r3 = r7.f558
                r4 = 123(0x7b, float:1.72E-43)
                r5 = 4
                int[] r4 = new int[]{r4, r5, r1, r1}
                java.lang.String r5 = "\u0000\u0001\u0001\u0001"
                java.lang.String r0 = m866(r5, r0, r4)
                java.lang.String r0 = r0.intern()
                java.lang.String r0 = r3.m788(r0)
                com.ironsource.adqualitysdk.sdk.i.aq$e$5 r3 = new com.ironsource.adqualitysdk.sdk.i.aq$e$5
                r3.<init>()
                r2.m2897(r0, r10, r3)
                int r8 = com.ironsource.adqualitysdk.sdk.i.aq.e.f551
                int r8 = r8 + 63
                int r9 = r8 % 128
                com.ironsource.adqualitysdk.sdk.i.aq.e.f552 = r9
                int r8 = r8 % 2
                if (r8 == 0) goto Laa
                r8 = 52
                int r8 = r8 / r1
            Laa:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ironsource.adqualitysdk.sdk.i.aq.e.mo842(android.content.Context, com.ironsource.adqualitysdk.sdk.i.as, boolean):void");
        }

        @Override // com.ironsource.adqualitysdk.sdk.i.aq
        /* renamed from: ﻐ */
        public final void mo835(final at atVar) {
            f551 = (f552 + 21) % 128;
            Handler handler = this.f566;
            if (handler != null) {
                handler.post(new iu() { // from class: com.ironsource.adqualitysdk.sdk.i.aq.e.9
                    @Override // com.ironsource.adqualitysdk.sdk.i.iu
                    /* renamed from: ﻐ */
                    public final void mo590() {
                        if (e.this.mo830()) {
                            atVar.mo667();
                        } else {
                            e.m861(e.this).add(atVar);
                        }
                    }
                });
                f552 = (f551 + 45) % 128;
            }
        }

        @Override // com.ironsource.adqualitysdk.sdk.i.aq
        /* renamed from: ｋ */
        public final void mo838(final at atVar) {
            f552 = (f551 + 37) % 128;
            Handler handler = this.f566;
            if (handler != null) {
                handler.post(new iu() { // from class: com.ironsource.adqualitysdk.sdk.i.aq.e.7
                    @Override // com.ironsource.adqualitysdk.sdk.i.iu
                    /* renamed from: ﻐ */
                    public final void mo590() {
                        e.m870(e.this, atVar);
                        if (e.this.mo830()) {
                            atVar.mo667();
                        }
                    }
                });
            }
            f552 = (f551 + 111) % 128;
        }

        @Override // com.ironsource.adqualitysdk.sdk.i.aq
        /* renamed from: ﻐ */
        public final boolean mo837() {
            f551 = (f552 + 93) % 128;
            boolean zOptBoolean = m849().optBoolean(m871(new int[]{-299846367, 901062462}, View.MeasureSpec.getMode(0) + 3).intern(), false);
            int i10 = f551 + 35;
            f552 = i10 % 128;
            if (i10 % 2 != 0) {
                int i11 = 39 / 0;
            }
            return zOptBoolean;
        }

        /* renamed from: ﻐ, reason: contains not printable characters */
        private static void m862(JSONObject jSONObject, long j10) throws JSONException {
            int i10 = f552 + 9;
            f551 = i10 % 128;
            if (i10 % 2 == 0) {
                if (!jSONObject.has(m871(new int[]{-440044683, -812843744}, 5 / Color.alpha(0)).intern())) {
                    return;
                }
            } else if (!jSONObject.has(m871(new int[]{-440044683, -812843744}, 3 - Color.alpha(0)).intern())) {
                return;
            }
            try {
                jSONObject.put(m871(new int[]{-440044683, -812843744}, KeyEvent.normalizeMetaState(0) + 3).intern(), jSONObject.optLong(m871(new int[]{-440044683, -812843744}, (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 2).intern()) + (j10 / 2));
                f551 = (f552 + 31) % 128;
            } catch (JSONException unused) {
            }
        }

        @Override // com.ironsource.adqualitysdk.sdk.i.aq
        /* renamed from: ｋ */
        public final boolean mo840() {
            int i10 = f552 + 99;
            f551 = i10 % 128;
            boolean zOptBoolean = i10 % 2 == 0 ? m849().optBoolean(m866("\u0001\u0000\u0001\u0000", false, new int[]{Sdk.SDKError.Reason.OMSDK_JS_WRITE_FAILED_VALUE, 4, 0, 4}).intern(), false) : m849().optBoolean(m866("\u0001\u0000\u0001\u0000", true, new int[]{Sdk.SDKError.Reason.OMSDK_JS_WRITE_FAILED_VALUE, 4, 0, 4}).intern(), true);
            f552 = (f551 + 85) % 128;
            return zOptBoolean;
        }

        /* renamed from: ｋ, reason: contains not printable characters */
        private static String m866(String str, boolean z10, int[] iArr) throws UnsupportedEncodingException {
            String str2;
            byte[] bytes = str;
            if (str != null) {
                bytes = str.getBytes("ISO-8859-1");
            }
            byte[] bArr = bytes;
            synchronized (g.f2307) {
                try {
                    int i10 = iArr[0];
                    int i11 = iArr[1];
                    int i12 = iArr[2];
                    int i13 = iArr[3];
                    char[] cArr = new char[i11];
                    System.arraycopy(f554, i10, cArr, 0, i11);
                    if (bArr != null) {
                        char[] cArr2 = new char[i11];
                        g.f2306 = 0;
                        char c10 = 0;
                        while (true) {
                            int i14 = g.f2306;
                            if (i14 >= i11) {
                                break;
                            }
                            if (bArr[i14] == 1) {
                                cArr2[i14] = (char) (((cArr[i14] << 1) + 1) - c10);
                            } else {
                                cArr2[i14] = (char) ((cArr[i14] << 1) - c10);
                            }
                            c10 = cArr2[i14];
                            g.f2306 = i14 + 1;
                        }
                        cArr = cArr2;
                    }
                    if (i13 > 0) {
                        char[] cArr3 = new char[i11];
                        System.arraycopy(cArr, 0, cArr3, 0, i11);
                        int i15 = i11 - i13;
                        System.arraycopy(cArr3, 0, cArr, i15, i13);
                        System.arraycopy(cArr3, i13, cArr, 0, i15);
                    }
                    if (z10) {
                        char[] cArr4 = new char[i11];
                        g.f2306 = 0;
                        while (true) {
                            int i16 = g.f2306;
                            if (i16 >= i11) {
                                break;
                            }
                            cArr4[i16] = cArr[(i11 - i16) - 1];
                            g.f2306 = i16 + 1;
                        }
                        cArr = cArr4;
                    }
                    if (i12 > 0) {
                        g.f2306 = 0;
                        while (true) {
                            int i17 = g.f2306;
                            if (i17 >= i11) {
                                break;
                            }
                            cArr[i17] = (char) (cArr[i17] - iArr[2]);
                            g.f2306 = i17 + 1;
                        }
                    }
                    str2 = new String(cArr);
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            return str2;
        }

        @Override // com.ironsource.adqualitysdk.sdk.i.aq
        /* renamed from: ﾇ */
        public final void mo843(final at atVar) {
            f551 = (f552 + 115) % 128;
            Handler handler = this.f566;
            if (handler != null) {
                handler.post(new iu() { // from class: com.ironsource.adqualitysdk.sdk.i.aq.e.2
                    @Override // com.ironsource.adqualitysdk.sdk.i.iu
                    /* renamed from: ﻐ */
                    public final void mo590() {
                        e.m864(e.this).add(atVar);
                        if (e.this.mo830()) {
                            atVar.mo667();
                        }
                    }
                });
                f552 = (f551 + 81) % 128;
            }
        }

        @Override // com.ironsource.adqualitysdk.sdk.i.aq
        /* renamed from: ﾇ */
        public final Map<String, au> mo841() {
            HashMap map = new HashMap();
            try {
                String strOptString = m849().optString(m871(new int[]{2078833056, -1220890097}, View.combineMeasuredStates(0, 0) + 3).intern());
                if (TextUtils.isEmpty(strOptString)) {
                    return map;
                }
                Map<String, au> mapM3186 = kc.m3186(new JSONObject(strOptString), new kc.b<au>() { // from class: com.ironsource.adqualitysdk.sdk.i.aq.e.10
                    @Override // com.ironsource.adqualitysdk.sdk.i.kc.b
                    /* renamed from: ﻐ, reason: contains not printable characters */
                    public final /* synthetic */ au mo879(JSONObject jSONObject, String str) {
                        return new au(jSONObject.optJSONObject(str));
                    }
                });
                f552 = (f551 + 99) % 128;
                return mapM3186;
            } catch (JSONException e10) {
                kd.m3203(m866("\u0000\u0001\u0000\u0000\u0001\u0001\u0000\u0000\u0001\u0000\u0001\u0000", false, new int[]{86, 12, 0, 0}).intern(), m866("\u0000\u0001\u0000\u0001\u0001\u0000\u0001\u0001\u0000\u0001\u0000\u0001\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0000\u0000\u0001\u0000\u0001", false, new int[]{143, 31, 173, 0}).intern(), e10, false);
                return map;
            }
        }

        @Override // com.ironsource.adqualitysdk.sdk.i.aq.AnonymousClass1
        /* renamed from: ﾒ */
        public final synchronized void mo851(JSONObject jSONObject) {
            try {
                f551 = (f552 + 85) % 128;
                if (m872(jSONObject)) {
                    m865(jSONObject);
                }
                super.mo851(jSONObject);
                this.f567.mo851(jSONObject);
                this.f570.mo851(jSONObject);
                this.f568.mo851(jSONObject);
                this.f565.mo851(jSONObject);
                int i10 = f552 + 115;
                f551 = i10 % 128;
                if (i10 % 2 == 0) {
                    throw null;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }

        @Override // com.ironsource.adqualitysdk.sdk.i.aq
        /* renamed from: ﾇ */
        public final boolean mo844(String str, String str2) {
            au auVarM863 = m863(str);
            if (auVarM863 == null) {
                return true;
            }
            int i10 = f551 + 107;
            f552 = i10 % 128;
            if (i10 % 2 != 0) {
                auVarM863.m918(str2);
                throw null;
            }
            if (!auVarM863.m918(str2)) {
                return true;
            }
            int i11 = f551 + 23;
            f552 = i11 % 128;
            if (i11 % 2 == 0) {
                return false;
            }
            throw null;
        }

        @Override // com.ironsource.adqualitysdk.sdk.i.aq
        /* renamed from: ﾒ */
        public final boolean mo847() {
            int i10 = f552 + 37;
            f551 = i10 % 128;
            boolean zOptBoolean = i10 % 2 == 0 ? m849().optBoolean(m866("\u0001\u0000\u0001", true, new int[]{130, 3, 163, 3}).intern(), false) : m849().optBoolean(m866("\u0001\u0000\u0001", false, new int[]{130, 3, 163, 3}).intern(), true);
            int i11 = f552 + 51;
            f551 = i11 % 128;
            if (i11 % 2 != 0) {
                return zOptBoolean;
            }
            throw null;
        }

        /* renamed from: ﾇ, reason: contains not printable characters */
        public final void m878(long j10) {
            int i10 = f551 + 25;
            int i11 = i10 % 128;
            f552 = i11;
            if (i10 % 2 != 0) {
                int i12 = 46 / 0;
                if (this.f555) {
                    return;
                }
            } else if (this.f555) {
                return;
            }
            f551 = (i11 + 11) % 128;
            this.f573.m2923(m866("\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u0001\u0000\u0001", false, new int[]{174, 37, 0, 0}).intern(), String.valueOf(j10));
            this.f555 = true;
        }

        @Override // com.ironsource.adqualitysdk.sdk.i.aq
        /* renamed from: ﾒ */
        public final String mo845(String str) {
            au auVarM863 = m863(str);
            if (auVarM863 == null) {
                return null;
            }
            f552 = (f551 + Sdk.SDKError.Reason.INVALID_RI_ENDPOINT_VALUE) % 128;
            String strM919 = auVarM863.m919();
            int i10 = f552 + 19;
            f551 = i10 % 128;
            if (i10 % 2 != 0) {
                return strM919;
            }
            throw null;
        }

        /* renamed from: ﾇ, reason: contains not printable characters */
        private static boolean m872(JSONObject jSONObject) {
            int i10 = f551 + 55;
            f552 = i10 % 128;
            return jSONObject.has((i10 % 2 != 0 ? m866("\u0001\u0001\u0000\u0001\u0000\u0001", false, new int[]{LossReason.LOSS_REASON_CREATIVE_FILTERED_ANIMATION_TOO_LONG_VALUE, 6, PsExtractor.AUDIO_STREAM, 1}) : m866("\u0001\u0001\u0000\u0001\u0000\u0001", false, new int[]{LossReason.LOSS_REASON_CREATIVE_FILTERED_ANIMATION_TOO_LONG_VALUE, 6, PsExtractor.AUDIO_STREAM, 1})).intern());
        }

        /* renamed from: ﾇ, reason: contains not printable characters */
        private static String m871(int[] iArr, int i10) {
            String str;
            synchronized (d.f1845) {
                try {
                    char[] cArr = new char[4];
                    char[] cArr2 = new char[iArr.length << 1];
                    int[] iArr2 = (int[]) f553.clone();
                    d.f1846 = 0;
                    while (true) {
                        int i11 = d.f1846;
                        if (i11 < iArr.length) {
                            int i12 = iArr[i11];
                            char c10 = (char) (i12 >> 16);
                            cArr[0] = c10;
                            char c11 = (char) i12;
                            cArr[1] = c11;
                            char c12 = (char) (iArr[i11 + 1] >> 16);
                            cArr[2] = c12;
                            char c13 = (char) iArr[i11 + 1];
                            cArr[3] = c13;
                            d.f1844 = (c10 << 16) + c11;
                            d.f1847 = (c12 << 16) + c13;
                            d.m2179(iArr2);
                            for (int i13 = 0; i13 < 16; i13++) {
                                int i14 = d.f1844 ^ iArr2[i13];
                                d.f1844 = i14;
                                int iM2178 = d.m2178(i14) ^ d.f1847;
                                int i15 = d.f1844;
                                d.f1844 = iM2178;
                                d.f1847 = i15;
                            }
                            int i16 = d.f1844;
                            int i17 = d.f1847;
                            d.f1844 = i17;
                            d.f1847 = i16;
                            int i18 = i16 ^ iArr2[16];
                            d.f1847 = i18;
                            int i19 = i17 ^ iArr2[17];
                            d.f1844 = i19;
                            cArr[0] = (char) (i19 >>> 16);
                            cArr[1] = (char) i19;
                            cArr[2] = (char) (i18 >>> 16);
                            cArr[3] = (char) i18;
                            d.m2179(iArr2);
                            int i20 = d.f1846;
                            cArr2[i20 << 1] = cArr[0];
                            cArr2[(i20 << 1) + 1] = cArr[1];
                            cArr2[(i20 << 1) + 2] = cArr[2];
                            cArr2[(i20 << 1) + 3] = cArr[3];
                            d.f1846 = i20 + 2;
                        } else {
                            str = new String(cArr2, 0, i10);
                        }
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            return str;
        }
    }

    public /* synthetic */ aq(byte b10) {
        this();
    }

    /* renamed from: ﻛ, reason: contains not printable characters */
    public static synchronized aq m814() {
        try {
            if (f548 == null) {
                f548 = new e();
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return f548;
    }

    /* renamed from: リ, reason: contains not printable characters */
    public abstract List mo815();

    /* renamed from: ヮ, reason: contains not printable characters */
    public abstract boolean mo816();

    /* renamed from: ヶ, reason: contains not printable characters */
    public abstract long mo817();

    /* renamed from: 丫, reason: contains not printable characters */
    public abstract int mo818();

    /* renamed from: 乁, reason: contains not printable characters */
    public abstract boolean mo819();

    /* renamed from: 爫, reason: contains not printable characters */
    public abstract JSONObject mo820();

    /* renamed from: ﬤ, reason: contains not printable characters */
    public abstract int mo821();

    /* renamed from: טּ, reason: contains not printable characters */
    public abstract String mo822();

    /* renamed from: סּ, reason: contains not printable characters */
    public abstract void mo823();

    /* renamed from: ףּ, reason: contains not printable characters */
    public abstract int mo824();

    /* renamed from: ﭖ, reason: contains not printable characters */
    public abstract ao mo825();

    /* renamed from: ﭴ, reason: contains not printable characters */
    public abstract String mo826();

    /* renamed from: ﭸ, reason: contains not printable characters */
    public abstract ap mo827();

    /* renamed from: ﮉ, reason: contains not printable characters */
    public abstract ar mo828();

    /* renamed from: ﮌ, reason: contains not printable characters */
    public abstract av mo829();

    /* renamed from: ﮐ, reason: contains not printable characters */
    public abstract boolean mo830();

    /* renamed from: ﱟ, reason: contains not printable characters */
    public abstract int mo831();

    /* renamed from: ﱡ, reason: contains not printable characters */
    public abstract boolean mo832();

    /* renamed from: ﺙ, reason: contains not printable characters */
    public abstract double mo833();

    /* renamed from: ﻏ, reason: contains not printable characters */
    public abstract double mo834();

    /* renamed from: ﻐ, reason: contains not printable characters */
    public abstract void mo835(at atVar);

    /* renamed from: ﻐ, reason: contains not printable characters */
    public abstract void mo836(iw iwVar);

    /* renamed from: ﻐ, reason: contains not printable characters */
    public abstract boolean mo837();

    /* renamed from: ｋ, reason: contains not printable characters */
    public abstract void mo838(at atVar);

    /* renamed from: ｋ, reason: contains not printable characters */
    public abstract void mo839(JSONObject jSONObject);

    /* renamed from: ｋ, reason: contains not printable characters */
    public abstract boolean mo840();

    /* renamed from: ﾇ, reason: contains not printable characters */
    public abstract Map<String, au> mo841();

    /* renamed from: ﾇ, reason: contains not printable characters */
    public abstract void mo842(Context context, as asVar, boolean z10);

    /* renamed from: ﾇ, reason: contains not printable characters */
    public abstract void mo843(at atVar);

    /* renamed from: ﾇ, reason: contains not printable characters */
    public abstract boolean mo844(String str, String str2);

    /* renamed from: ﾒ, reason: contains not printable characters */
    public abstract String mo845(String str);

    /* renamed from: ﾒ, reason: contains not printable characters */
    public abstract void mo846(Context context, iy iyVar, ak akVar, a aVar, boolean z10);

    /* renamed from: ﾒ, reason: contains not printable characters */
    public abstract boolean mo847();

    private aq() {
    }
}
