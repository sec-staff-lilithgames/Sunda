package com.bytedance.adsdk.ugeno.zz.jd;

import android.content.Context;
import android.text.TextUtils;
import android.widget.FrameLayout;
import com.bytedance.adsdk.ugeno.jd.jpo;
import org.json.JSONException;
import qm.zMPW.GalEuEfxjome;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class jd extends com.bytedance.adsdk.ugeno.jd.jpo<com.bytedance.adsdk.ugeno.zz.jd.jpo> {

    /* renamed from: gf, reason: collision with root package name */
    private com.bytedance.adsdk.ugeno.zz.jd.jpo f18084gf;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    /* loaded from: classes2.dex */
    public static class jpo extends jpo.C0062jpo {

        /* renamed from: se, reason: collision with root package name */
        protected int f18085se;

        public jpo(com.bytedance.adsdk.ugeno.jd.jpo jpoVar) {
            super(jpoVar);
            this.f18085se = -1;
        }

        /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
        /* JADX WARN: Removed duplicated region for block: B:4:0x000e  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        private int jd(java.lang.String r6) {
            /*
                r5 = this;
                r6.getClass()
                int r0 = r6.hashCode()
                r1 = 5
                r2 = 3
                r3 = 1
                r4 = -1
                switch(r0) {
                    case -1383228885: goto L52;
                    case -1364013995: goto L47;
                    case -348726240: goto L3c;
                    case 115029: goto L31;
                    case 3317767: goto L26;
                    case 108511772: goto L1b;
                    case 1063616078: goto L10;
                    default: goto Le;
                }
            Le:
                r6 = r4
                goto L5c
            L10:
                java.lang.String r0 = "center_horizontal"
                boolean r6 = r6.equals(r0)
                if (r6 != 0) goto L19
                goto Le
            L19:
                r6 = 6
                goto L5c
            L1b:
                java.lang.String r0 = "right"
                boolean r6 = r6.equals(r0)
                if (r6 != 0) goto L24
                goto Le
            L24:
                r6 = r1
                goto L5c
            L26:
                java.lang.String r0 = "left"
                boolean r6 = r6.equals(r0)
                if (r6 != 0) goto L2f
                goto Le
            L2f:
                r6 = 4
                goto L5c
            L31:
                java.lang.String r0 = "top"
                boolean r6 = r6.equals(r0)
                if (r6 != 0) goto L3a
                goto Le
            L3a:
                r6 = r2
                goto L5c
            L3c:
                java.lang.String r0 = "center_vertical"
                boolean r6 = r6.equals(r0)
                if (r6 != 0) goto L45
                goto Le
            L45:
                r6 = 2
                goto L5c
            L47:
                java.lang.String r0 = "center"
                boolean r6 = r6.equals(r0)
                if (r6 != 0) goto L50
                goto Le
            L50:
                r6 = r3
                goto L5c
            L52:
                java.lang.String r0 = "bottom"
                boolean r6 = r6.equals(r0)
                if (r6 != 0) goto L5b
                goto Le
            L5b:
                r6 = 0
            L5c:
                switch(r6) {
                    case 0: goto L6c;
                    case 1: goto L69;
                    case 2: goto L66;
                    case 3: goto L63;
                    case 4: goto L62;
                    case 5: goto L61;
                    case 6: goto L60;
                    default: goto L5f;
                }
            L5f:
                return r4
            L60:
                return r3
            L61:
                return r1
            L62:
                return r2
            L63:
                r6 = 48
                return r6
            L66:
                r6 = 16
                return r6
            L69:
                r6 = 17
                return r6
            L6c:
                r6 = 80
                return r6
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bytedance.adsdk.ugeno.zz.jd.jd.jpo.jd(java.lang.String):int");
        }

        @Override // com.bytedance.adsdk.ugeno.jd.jpo.C0062jpo
        /* renamed from: jd, reason: merged with bridge method [inline-methods] */
        public FrameLayout.LayoutParams jpo() {
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams((int) this.jpo, (int) this.f17785jd);
            layoutParams.leftMargin = (int) this.f17786jj;
            layoutParams.rightMargin = (int) this.f17790qk;
            layoutParams.topMargin = (int) this.xyk;
            layoutParams.bottomMargin = (int) this.zz;
            layoutParams.gravity = this.f18085se;
            return layoutParams;
        }

        @Override // com.bytedance.adsdk.ugeno.jd.jpo.C0062jpo
        public void jpo(Context context, String str, String str2) {
            if (TextUtils.isEmpty(str)) {
                return;
            }
            super.jpo(context, str, str2);
            if (TextUtils.equals(str, "layoutGravity")) {
                this.f18085se = jpo(str2);
            }
        }

        private int jpo(String str) {
            String[] strArrSplit;
            if (TextUtils.isEmpty(str) || (strArrSplit = str.split(GalEuEfxjome.uyswmvFNxmavU)) == null || strArrSplit.length <= 0) {
                return -1;
            }
            int iJd = 0;
            for (String str2 : strArrSplit) {
                iJd |= jd(str2);
            }
            return iJd;
        }
    }

    public jd(Context context) {
        super(context);
    }

    @Override // com.bytedance.adsdk.ugeno.jd.jpo, com.bytedance.adsdk.ugeno.jd.wqx
    public void jd() throws JSONException {
        this.f18084gf.setEventMap(this.f17843zw);
        super.jd();
    }

    @Override // com.bytedance.adsdk.ugeno.jd.wqx
    /* renamed from: wqx, reason: merged with bridge method [inline-methods] */
    public com.bytedance.adsdk.ugeno.zz.jd.jpo jpo() {
        com.bytedance.adsdk.ugeno.zz.jd.jpo jpoVar = new com.bytedance.adsdk.ugeno.zz.jd.jpo(this.f17811jd);
        this.f18084gf = jpoVar;
        jpoVar.jpo(this);
        return this.f18084gf;
    }

    @Override // com.bytedance.adsdk.ugeno.jd.jpo
    public jpo.C0062jpo yd() {
        return new jpo(this);
    }
}
