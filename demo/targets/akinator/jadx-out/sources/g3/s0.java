package g3;

import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.Xml;
import android.view.View;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.AnimationUtils;
import android.view.animation.AnticipateInterpolator;
import android.view.animation.BounceInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import android.view.animation.OvershootInterpolator;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.k;
import com.digidust.elokence.akinator.freemium.R;
import g3.l0;
import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class s0 {

    /* renamed from: a, reason: collision with root package name */
    public int f57246a;

    /* renamed from: e, reason: collision with root package name */
    public int f57250e;

    /* renamed from: f, reason: collision with root package name */
    public final i f57251f;

    /* renamed from: g, reason: collision with root package name */
    public final k.a f57252g;

    /* renamed from: j, reason: collision with root package name */
    public int f57255j;

    /* renamed from: k, reason: collision with root package name */
    public String f57256k;

    /* renamed from: o, reason: collision with root package name */
    public final Context f57260o;

    /* renamed from: b, reason: collision with root package name */
    public int f57247b = -1;

    /* renamed from: c, reason: collision with root package name */
    public boolean f57248c = false;

    /* renamed from: d, reason: collision with root package name */
    public int f57249d = 0;

    /* renamed from: h, reason: collision with root package name */
    public int f57253h = -1;

    /* renamed from: i, reason: collision with root package name */
    public int f57254i = -1;

    /* renamed from: l, reason: collision with root package name */
    public int f57257l = 0;

    /* renamed from: m, reason: collision with root package name */
    public String f57258m = null;

    /* renamed from: n, reason: collision with root package name */
    public int f57259n = -1;

    /* renamed from: p, reason: collision with root package name */
    public int f57261p = -1;

    /* renamed from: q, reason: collision with root package name */
    public int f57262q = -1;

    /* renamed from: r, reason: collision with root package name */
    public int f57263r = -1;

    /* renamed from: s, reason: collision with root package name */
    public int f57264s = -1;

    /* renamed from: t, reason: collision with root package name */
    public int f57265t = -1;

    /* renamed from: u, reason: collision with root package name */
    public int f57266u = -1;

    /* renamed from: v, reason: collision with root package name */
    public int f57267v = -1;

    /* JADX WARN: Removed duplicated region for block: B:36:0x0099 A[Catch: IOException -> 0x0045, XmlPullParserException -> 0x0048, TryCatch #2 {IOException -> 0x0045, XmlPullParserException -> 0x0048, blocks: (B:3:0x002a, B:37:0x00cc, B:11:0x0039, B:18:0x004b, B:19:0x0053, B:36:0x0099, B:21:0x0057, B:26:0x0068, B:24:0x0060, B:27:0x0070, B:29:0x0076, B:30:0x007a, B:32:0x0082, B:33:0x008a, B:35:0x0092), top: B:42:0x002a }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public s0(android.content.Context r6, android.content.res.XmlResourceParser r7) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException {
        /*
            r5 = this;
            java.lang.String r0 = "Error parsing XML resource"
            java.lang.String r1 = "ViewTransition"
            r5.<init>()
            r2 = -1
            r5.f57247b = r2
            r3 = 0
            r5.f57248c = r3
            r5.f57249d = r3
            r5.f57253h = r2
            r5.f57254i = r2
            r5.f57257l = r3
            r3 = 0
            r5.f57258m = r3
            r5.f57259n = r2
            r5.f57261p = r2
            r5.f57262q = r2
            r5.f57263r = r2
            r5.f57264s = r2
            r5.f57265t = r2
            r5.f57266u = r2
            r5.f57267v = r2
            r5.f57260o = r6
            int r2 = r7.getEventType()     // Catch: java.io.IOException -> L45 org.xmlpull.v1.XmlPullParserException -> L48
        L2e:
            r3 = 1
            if (r2 == r3) goto Ld9
            r3 = 2
            if (r2 == r3) goto L4b
            r3 = 3
            if (r2 == r3) goto L39
            goto Lcc
        L39:
            java.lang.String r2 = r7.getName()     // Catch: java.io.IOException -> L45 org.xmlpull.v1.XmlPullParserException -> L48
            boolean r2 = r1.equals(r2)     // Catch: java.io.IOException -> L45 org.xmlpull.v1.XmlPullParserException -> L48
            if (r2 == 0) goto Lcc
            goto Ld9
        L45:
            r6 = move-exception
            goto Ld2
        L48:
            r6 = move-exception
            goto Ld6
        L4b:
            java.lang.String r2 = r7.getName()     // Catch: java.io.IOException -> L45 org.xmlpull.v1.XmlPullParserException -> L48
            int r3 = r2.hashCode()     // Catch: java.io.IOException -> L45 org.xmlpull.v1.XmlPullParserException -> L48
            switch(r3) {
                case -1962203927: goto L8a;
                case -1239391468: goto L7a;
                case 61998586: goto L70;
                case 366511058: goto L60;
                case 1791837707: goto L57;
                default: goto L56;
            }     // Catch: java.io.IOException -> L45 org.xmlpull.v1.XmlPullParserException -> L48
        L56:
            goto L99
        L57:
            java.lang.String r3 = "CustomAttribute"
            boolean r3 = r2.equals(r3)     // Catch: java.io.IOException -> L45 org.xmlpull.v1.XmlPullParserException -> L48
            if (r3 == 0) goto L99
            goto L68
        L60:
            java.lang.String r3 = "CustomMethod"
            boolean r3 = r2.equals(r3)     // Catch: java.io.IOException -> L45 org.xmlpull.v1.XmlPullParserException -> L48
            if (r3 == 0) goto L99
        L68:
            androidx.constraintlayout.widget.k$a r2 = r5.f57252g     // Catch: java.io.IOException -> L45 org.xmlpull.v1.XmlPullParserException -> L48
            java.util.HashMap r2 = r2.f5442g     // Catch: java.io.IOException -> L45 org.xmlpull.v1.XmlPullParserException -> L48
            androidx.constraintlayout.widget.b.parse(r6, r7, r2)     // Catch: java.io.IOException -> L45 org.xmlpull.v1.XmlPullParserException -> L48
            goto Lcc
        L70:
            boolean r3 = r2.equals(r1)     // Catch: java.io.IOException -> L45 org.xmlpull.v1.XmlPullParserException -> L48
            if (r3 == 0) goto L99
            r5.d(r6, r7)     // Catch: java.io.IOException -> L45 org.xmlpull.v1.XmlPullParserException -> L48
            goto Lcc
        L7a:
            java.lang.String r3 = "KeyFrameSet"
            boolean r3 = r2.equals(r3)     // Catch: java.io.IOException -> L45 org.xmlpull.v1.XmlPullParserException -> L48
            if (r3 == 0) goto L99
            g3.i r2 = new g3.i     // Catch: java.io.IOException -> L45 org.xmlpull.v1.XmlPullParserException -> L48
            r2.<init>(r6, r7)     // Catch: java.io.IOException -> L45 org.xmlpull.v1.XmlPullParserException -> L48
            r5.f57251f = r2     // Catch: java.io.IOException -> L45 org.xmlpull.v1.XmlPullParserException -> L48
            goto Lcc
        L8a:
            java.lang.String r3 = "ConstraintOverride"
            boolean r3 = r2.equals(r3)     // Catch: java.io.IOException -> L45 org.xmlpull.v1.XmlPullParserException -> L48
            if (r3 == 0) goto L99
            androidx.constraintlayout.widget.k$a r2 = androidx.constraintlayout.widget.k.buildDelta(r6, r7)     // Catch: java.io.IOException -> L45 org.xmlpull.v1.XmlPullParserException -> L48
            r5.f57252g = r2     // Catch: java.io.IOException -> L45 org.xmlpull.v1.XmlPullParserException -> L48
            goto Lcc
        L99:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.io.IOException -> L45 org.xmlpull.v1.XmlPullParserException -> L48
            r3.<init>()     // Catch: java.io.IOException -> L45 org.xmlpull.v1.XmlPullParserException -> L48
            java.lang.String r4 = g3.b.getLoc()     // Catch: java.io.IOException -> L45 org.xmlpull.v1.XmlPullParserException -> L48
            r3.append(r4)     // Catch: java.io.IOException -> L45 org.xmlpull.v1.XmlPullParserException -> L48
            java.lang.String r4 = " unknown tag "
            r3.append(r4)     // Catch: java.io.IOException -> L45 org.xmlpull.v1.XmlPullParserException -> L48
            r3.append(r2)     // Catch: java.io.IOException -> L45 org.xmlpull.v1.XmlPullParserException -> L48
            java.lang.String r2 = r3.toString()     // Catch: java.io.IOException -> L45 org.xmlpull.v1.XmlPullParserException -> L48
            android.util.Log.e(r1, r2)     // Catch: java.io.IOException -> L45 org.xmlpull.v1.XmlPullParserException -> L48
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.io.IOException -> L45 org.xmlpull.v1.XmlPullParserException -> L48
            r2.<init>()     // Catch: java.io.IOException -> L45 org.xmlpull.v1.XmlPullParserException -> L48
            java.lang.String r3 = ".xml:"
            r2.append(r3)     // Catch: java.io.IOException -> L45 org.xmlpull.v1.XmlPullParserException -> L48
            int r3 = r7.getLineNumber()     // Catch: java.io.IOException -> L45 org.xmlpull.v1.XmlPullParserException -> L48
            r2.append(r3)     // Catch: java.io.IOException -> L45 org.xmlpull.v1.XmlPullParserException -> L48
            java.lang.String r2 = r2.toString()     // Catch: java.io.IOException -> L45 org.xmlpull.v1.XmlPullParserException -> L48
            android.util.Log.e(r1, r2)     // Catch: java.io.IOException -> L45 org.xmlpull.v1.XmlPullParserException -> L48
        Lcc:
            int r2 = r7.next()     // Catch: java.io.IOException -> L45 org.xmlpull.v1.XmlPullParserException -> L48
            goto L2e
        Ld2:
            android.util.Log.e(r1, r0, r6)
            goto Ld9
        Ld6:
            android.util.Log.e(r1, r0, r6)
        Ld9:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: g3.s0.<init>(android.content.Context, android.content.res.XmlResourceParser):void");
    }

    public final void a(u0 u0Var, i0 i0Var, int i10, androidx.constraintlayout.widget.k kVar, View... viewArr) {
        Interpolator interpolatorLoadInterpolator;
        Interpolator q0Var;
        if (this.f57248c) {
            return;
        }
        int i11 = this.f57250e;
        i iVar = this.f57251f;
        if (i11 == 2) {
            View view = viewArr[0];
            s sVar = new s(view);
            j0 j0Var = sVar.f57225f;
            j0Var.f57034e = 0.0f;
            j0Var.f57035f = 0.0f;
            sVar.H = true;
            j0Var.d(view.getX(), view.getY(), view.getWidth(), view.getHeight());
            sVar.f57226g.d(view.getX(), view.getY(), view.getWidth(), view.getHeight());
            sVar.f57227h.setState(view);
            sVar.f57228i.setState(view);
            iVar.addAllFrames(sVar);
            sVar.setup(i0Var.getWidth(), i0Var.getHeight(), this.f57253h, System.nanoTime());
            int i12 = this.f57253h;
            int i13 = this.f57254i;
            int i14 = this.f57247b;
            Context context = i0Var.getContext();
            int i15 = this.f57257l;
            if (i15 == -2) {
                interpolatorLoadInterpolator = AnimationUtils.loadInterpolator(context, this.f57259n);
            } else {
                if (i15 == -1) {
                    q0Var = new q0(a3.g.getInterpolator(this.f57258m));
                    new r0(u0Var, sVar, i12, i13, i14, q0Var, this.f57261p, this.f57262q);
                    return;
                }
                interpolatorLoadInterpolator = i15 != 0 ? i15 != 1 ? i15 != 2 ? i15 != 4 ? i15 != 5 ? i15 != 6 ? null : new AnticipateInterpolator() : new OvershootInterpolator() : new BounceInterpolator() : new DecelerateInterpolator() : new AccelerateInterpolator() : new AccelerateDecelerateInterpolator();
            }
            q0Var = interpolatorLoadInterpolator;
            new r0(u0Var, sVar, i12, i13, i14, q0Var, this.f57261p, this.f57262q);
            return;
        }
        k.a aVar = this.f57252g;
        if (i11 == 1) {
            for (int i16 : i0Var.getConstraintSetIds()) {
                if (i16 != i10) {
                    androidx.constraintlayout.widget.k constraintSet = i0Var.getConstraintSet(i16);
                    for (View view2 : viewArr) {
                        k.a constraint = constraintSet.getConstraint(view2.getId());
                        if (aVar != null) {
                            aVar.applyDelta(constraint);
                            constraint.f5442g.putAll(aVar.f5442g);
                        }
                    }
                }
            }
        }
        androidx.constraintlayout.widget.k kVar2 = new androidx.constraintlayout.widget.k();
        kVar2.clone(kVar);
        for (View view3 : viewArr) {
            k.a constraint2 = kVar2.getConstraint(view3.getId());
            if (aVar != null) {
                aVar.applyDelta(constraint2);
                constraint2.f5442g.putAll(aVar.f5442g);
            }
        }
        i0Var.updateState(i10, kVar2);
        i0Var.updateState(R.id.view_transition, kVar);
        i0Var.setState(R.id.view_transition, -1, -1);
        l0.a aVar2 = new l0.a(-1, i0Var.f56982b, R.id.view_transition, i10);
        for (View view4 : viewArr) {
            int i17 = this.f57253h;
            if (i17 != -1) {
                aVar2.setDuration(i17);
            }
            aVar2.setPathMotionArc(this.f57249d);
            aVar2.setInterpolatorInfo(this.f57257l, this.f57258m, this.f57259n);
            int id2 = view4.getId();
            if (iVar != null) {
                ArrayList<d> keyFramesForView = iVar.getKeyFramesForView(-1);
                i iVar2 = new i();
                Iterator<d> it = keyFramesForView.iterator();
                while (it.hasNext()) {
                    iVar2.addKey(it.next().mo4052clone().setViewId(id2));
                }
                aVar2.addKeyFrame(iVar2);
            }
        }
        i0Var.setTransition(aVar2);
        i0Var.transitionToEnd(new com.ironsource.environment.thread.a(29, this, viewArr));
    }

    public final boolean b(View view) {
        int i10 = this.f57263r;
        boolean z10 = i10 == -1 || view.getTag(i10) != null;
        int i11 = this.f57264s;
        return z10 && (i11 == -1 || view.getTag(i11) == null);
    }

    public final boolean c(View view) {
        String str;
        if (view == null) {
            return false;
        }
        if ((this.f57255j == -1 && this.f57256k == null) || !b(view)) {
            return false;
        }
        if (view.getId() == this.f57255j) {
            return true;
        }
        return this.f57256k != null && (view.getLayoutParams() instanceof ConstraintLayout.a) && (str = ((ConstraintLayout.a) view.getLayoutParams()).Y) != null && str.matches(this.f57256k);
    }

    public final void d(Context context, XmlResourceParser xmlResourceParser) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlResourceParser), androidx.constraintlayout.widget.r.f5566y);
        int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
        for (int i10 = 0; i10 < indexCount; i10++) {
            int index = typedArrayObtainStyledAttributes.getIndex(i10);
            if (index == 0) {
                this.f57246a = typedArrayObtainStyledAttributes.getResourceId(index, this.f57246a);
            } else if (index == 8) {
                if (i0.f56980z0) {
                    int resourceId = typedArrayObtainStyledAttributes.getResourceId(index, this.f57255j);
                    this.f57255j = resourceId;
                    if (resourceId == -1) {
                        this.f57256k = typedArrayObtainStyledAttributes.getString(index);
                    }
                } else if (typedArrayObtainStyledAttributes.peekValue(index).type == 3) {
                    this.f57256k = typedArrayObtainStyledAttributes.getString(index);
                } else {
                    this.f57255j = typedArrayObtainStyledAttributes.getResourceId(index, this.f57255j);
                }
            } else if (index == 9) {
                this.f57247b = typedArrayObtainStyledAttributes.getInt(index, this.f57247b);
            } else if (index == 12) {
                this.f57248c = typedArrayObtainStyledAttributes.getBoolean(index, this.f57248c);
            } else if (index == 10) {
                this.f57249d = typedArrayObtainStyledAttributes.getInt(index, this.f57249d);
            } else if (index == 4) {
                this.f57253h = typedArrayObtainStyledAttributes.getInt(index, this.f57253h);
            } else if (index == 13) {
                this.f57254i = typedArrayObtainStyledAttributes.getInt(index, this.f57254i);
            } else if (index == 14) {
                this.f57250e = typedArrayObtainStyledAttributes.getInt(index, this.f57250e);
            } else if (index == 7) {
                int i11 = typedArrayObtainStyledAttributes.peekValue(index).type;
                if (i11 == 1) {
                    int resourceId2 = typedArrayObtainStyledAttributes.getResourceId(index, -1);
                    this.f57259n = resourceId2;
                    if (resourceId2 != -1) {
                        this.f57257l = -2;
                    }
                } else if (i11 == 3) {
                    String string = typedArrayObtainStyledAttributes.getString(index);
                    this.f57258m = string;
                    if (string == null || string.indexOf("/") <= 0) {
                        this.f57257l = -1;
                    } else {
                        this.f57259n = typedArrayObtainStyledAttributes.getResourceId(index, -1);
                        this.f57257l = -2;
                    }
                } else {
                    this.f57257l = typedArrayObtainStyledAttributes.getInteger(index, this.f57257l);
                }
            } else if (index == 11) {
                this.f57261p = typedArrayObtainStyledAttributes.getResourceId(index, this.f57261p);
            } else if (index == 3) {
                this.f57262q = typedArrayObtainStyledAttributes.getResourceId(index, this.f57262q);
            } else if (index == 6) {
                this.f57263r = typedArrayObtainStyledAttributes.getResourceId(index, this.f57263r);
            } else if (index == 5) {
                this.f57264s = typedArrayObtainStyledAttributes.getResourceId(index, this.f57264s);
            } else if (index == 2) {
                this.f57266u = typedArrayObtainStyledAttributes.getResourceId(index, this.f57266u);
            } else if (index == 1) {
                this.f57265t = typedArrayObtainStyledAttributes.getInteger(index, this.f57265t);
            }
        }
        typedArrayObtainStyledAttributes.recycle();
    }

    public int getSharedValue() {
        return this.f57265t;
    }

    public int getSharedValueCurrent() {
        return this.f57267v;
    }

    public int getSharedValueID() {
        return this.f57266u;
    }

    public int getStateTransition() {
        return this.f57247b;
    }

    public void setSharedValue(int i10) {
        this.f57265t = i10;
    }

    public void setSharedValueCurrent(int i10) {
        this.f57267v = i10;
    }

    public void setSharedValueID(int i10) {
        this.f57266u = i10;
    }

    public void setStateTransition(int i10) {
        this.f57247b = i10;
    }

    public String toString() {
        return "ViewTransition(" + b.getName(this.f57260o, this.f57246a) + ")";
    }
}
