package g3;

import android.content.Context;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Locale;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public class p extends d {

    /* renamed from: x, reason: collision with root package name */
    public float f57160x;

    /* renamed from: f, reason: collision with root package name */
    public float f57142f = 0.1f;

    /* renamed from: g, reason: collision with root package name */
    public int f57143g = -1;

    /* renamed from: h, reason: collision with root package name */
    public int f57144h = -1;

    /* renamed from: i, reason: collision with root package name */
    public int f57145i = -1;

    /* renamed from: j, reason: collision with root package name */
    public RectF f57146j = new RectF();

    /* renamed from: k, reason: collision with root package name */
    public RectF f57147k = new RectF();

    /* renamed from: l, reason: collision with root package name */
    public HashMap f57148l = new HashMap();

    /* renamed from: m, reason: collision with root package name */
    public String f57149m = null;

    /* renamed from: n, reason: collision with root package name */
    public int f57150n = -1;

    /* renamed from: o, reason: collision with root package name */
    public String f57151o = null;

    /* renamed from: p, reason: collision with root package name */
    public String f57152p = null;

    /* renamed from: q, reason: collision with root package name */
    public int f57153q = -1;

    /* renamed from: r, reason: collision with root package name */
    public int f57154r = -1;

    /* renamed from: s, reason: collision with root package name */
    public View f57155s = null;

    /* renamed from: t, reason: collision with root package name */
    public boolean f57156t = true;

    /* renamed from: u, reason: collision with root package name */
    public boolean f57157u = true;

    /* renamed from: v, reason: collision with root package name */
    public boolean f57158v = true;

    /* renamed from: w, reason: collision with root package name */
    public float f57159w = Float.NaN;

    /* renamed from: y, reason: collision with root package name */
    public boolean f57161y = false;

    public p() {
        this.f56928d = 5;
        this.f56929e = new HashMap();
    }

    public static void d(RectF rectF, View view, boolean z10) {
        rectF.top = view.getTop();
        rectF.bottom = view.getBottom();
        rectF.left = view.getLeft();
        rectF.right = view.getRight();
        if (z10) {
            view.getMatrix().mapRect(rectF);
        }
    }

    public final void c(View view, String str) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        Method method;
        if (str == null) {
            return;
        }
        if (str.startsWith(".")) {
            boolean z10 = str.length() == 1;
            if (!z10) {
                str = str.substring(1).toLowerCase(Locale.ROOT);
            }
            for (String str2 : this.f56929e.keySet()) {
                String lowerCase = str2.toLowerCase(Locale.ROOT);
                if (z10 || lowerCase.matches(str)) {
                    androidx.constraintlayout.widget.b bVar = (androidx.constraintlayout.widget.b) this.f56929e.get(str2);
                    if (bVar != null) {
                        bVar.applyCustom(view);
                    }
                }
            }
            return;
        }
        if (this.f57148l.containsKey(str)) {
            method = (Method) this.f57148l.get(str);
            if (method == null) {
                return;
            }
        } else {
            method = null;
        }
        if (method == null) {
            try {
                method = view.getClass().getMethod(str, null);
                this.f57148l.put(str, method);
            } catch (NoSuchMethodException unused) {
                this.f57148l.put(str, null);
                Log.e("KeyTrigger", "Could not find method \"" + str + "\"on class " + view.getClass().getSimpleName() + " " + b.getName(view));
                return;
            }
        }
        try {
            method.invoke(view, null);
        } catch (Exception unused2) {
            Log.e("KeyTrigger", "Exception in call \"" + this.f57149m + "\"on class " + view.getClass().getSimpleName() + " " + b.getName(view));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00c9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void conditionallyFire(float r11, android.view.View r12) {
        /*
            Method dump skipped, instructions count: 341
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: g3.p.conditionallyFire(float, android.view.View):void");
    }

    @Override // g3.d
    public d copy(d dVar) {
        super.copy(dVar);
        p pVar = (p) dVar;
        pVar.getClass();
        this.f57149m = pVar.f57149m;
        this.f57150n = pVar.f57150n;
        this.f57151o = pVar.f57151o;
        this.f57152p = pVar.f57152p;
        this.f57153q = pVar.f57153q;
        this.f57154r = pVar.f57154r;
        this.f57155s = pVar.f57155s;
        this.f57142f = pVar.f57142f;
        this.f57156t = pVar.f57156t;
        this.f57157u = pVar.f57157u;
        this.f57158v = pVar.f57158v;
        this.f57159w = pVar.f57159w;
        this.f57160x = pVar.f57160x;
        this.f57161y = pVar.f57161y;
        this.f57146j = pVar.f57146j;
        this.f57147k = pVar.f57147k;
        this.f57148l = pVar.f57148l;
        return this;
    }

    @Override // g3.d
    public void load(Context context, AttributeSet attributeSet) {
        o.read(this, context.obtainStyledAttributes(attributeSet, androidx.constraintlayout.widget.r.f5552k), context);
    }

    @Override // g3.d
    public void setValue(String str, Object obj) {
        str.getClass();
        switch (str) {
            case "positiveCross":
                this.f57152p = obj.toString();
                break;
            case "viewTransitionOnPositiveCross":
                this.f57144h = d.b(obj);
                break;
            case "triggerCollisionId":
                this.f57154r = d.b(obj);
                break;
            case "triggerID":
                this.f57153q = d.b(obj);
                break;
            case "negativeCross":
                this.f57151o = obj.toString();
                break;
            case "triggerCollisionView":
                this.f57155s = (View) obj;
                break;
            case "viewTransitionOnNegativeCross":
                this.f57143g = d.b(obj);
                break;
            case "CROSS":
                this.f57149m = obj.toString();
                break;
            case "triggerSlack":
                this.f57142f = d.a(obj);
                break;
            case "viewTransitionOnCross":
                this.f57145i = d.b(obj);
                break;
            case "postLayout":
                this.f57161y = obj instanceof Boolean ? ((Boolean) obj).booleanValue() : Boolean.parseBoolean(obj.toString());
                break;
            case "triggerReceiver":
                this.f57150n = d.b(obj);
                break;
        }
    }

    @Override // g3.d
    /* renamed from: clone */
    public d mo4052clone() {
        return new p().copy(this);
    }

    @Override // g3.d
    public void addValues(HashMap<String, f3.q> map) {
    }

    @Override // g3.d
    public void getAttributeNames(HashSet<String> hashSet) {
    }
}
