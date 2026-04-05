package o;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.PorterDuff;
import android.util.AttributeSet;
import android.util.Log;
import android.util.Xml;
import android.view.InflateException;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import com.applovin.shadow.okhttp3.internal.http2.Settings;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import p.q;
import p.v;
import q.l1;
import q.n3;
import x3.f0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public class h extends MenuInflater {

    /* renamed from: e, reason: collision with root package name */
    public static final Class[] f77241e;

    /* renamed from: f, reason: collision with root package name */
    public static final Class[] f77242f;

    /* renamed from: a, reason: collision with root package name */
    public final Object[] f77243a;

    /* renamed from: b, reason: collision with root package name */
    public final Object[] f77244b;

    /* renamed from: c, reason: collision with root package name */
    public final Context f77245c;

    /* renamed from: d, reason: collision with root package name */
    public Object f77246d;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static class a implements MenuItem.OnMenuItemClickListener {

        /* renamed from: e, reason: collision with root package name */
        public static final Class[] f77247e = {MenuItem.class};

        /* renamed from: b, reason: collision with root package name */
        public final Object f77248b;

        /* renamed from: c, reason: collision with root package name */
        public final Method f77249c;

        public a(Object obj, String str) {
            this.f77248b = obj;
            Class<?> cls = obj.getClass();
            try {
                this.f77249c = cls.getMethod(str, f77247e);
            } catch (Exception e10) {
                StringBuilder sbO = e3.g.o("Couldn't resolve menu item onClick handler ", str, " in class ");
                sbO.append(cls.getName());
                InflateException inflateException = new InflateException(sbO.toString());
                inflateException.initCause(e10);
                throw inflateException;
            }
        }

        @Override // android.view.MenuItem.OnMenuItemClickListener
        public boolean onMenuItemClick(MenuItem menuItem) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
            Method method = this.f77249c;
            try {
                Class<?> returnType = method.getReturnType();
                Class<?> cls = Boolean.TYPE;
                Object obj = this.f77248b;
                if (returnType == cls) {
                    return ((Boolean) method.invoke(obj, menuItem)).booleanValue();
                }
                method.invoke(obj, menuItem);
                return true;
            } catch (Exception e10) {
                throw new RuntimeException(e10);
            }
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public class b {
        public CharSequence A;
        public CharSequence B;
        public ColorStateList C = null;
        public PorterDuff.Mode D = null;

        /* renamed from: a, reason: collision with root package name */
        public final Menu f77250a;

        /* renamed from: b, reason: collision with root package name */
        public int f77251b;

        /* renamed from: c, reason: collision with root package name */
        public int f77252c;

        /* renamed from: d, reason: collision with root package name */
        public int f77253d;

        /* renamed from: e, reason: collision with root package name */
        public int f77254e;

        /* renamed from: f, reason: collision with root package name */
        public boolean f77255f;

        /* renamed from: g, reason: collision with root package name */
        public boolean f77256g;

        /* renamed from: h, reason: collision with root package name */
        public boolean f77257h;

        /* renamed from: i, reason: collision with root package name */
        public int f77258i;

        /* renamed from: j, reason: collision with root package name */
        public int f77259j;

        /* renamed from: k, reason: collision with root package name */
        public CharSequence f77260k;

        /* renamed from: l, reason: collision with root package name */
        public CharSequence f77261l;

        /* renamed from: m, reason: collision with root package name */
        public int f77262m;

        /* renamed from: n, reason: collision with root package name */
        public char f77263n;

        /* renamed from: o, reason: collision with root package name */
        public int f77264o;

        /* renamed from: p, reason: collision with root package name */
        public char f77265p;

        /* renamed from: q, reason: collision with root package name */
        public int f77266q;

        /* renamed from: r, reason: collision with root package name */
        public int f77267r;

        /* renamed from: s, reason: collision with root package name */
        public boolean f77268s;

        /* renamed from: t, reason: collision with root package name */
        public boolean f77269t;

        /* renamed from: u, reason: collision with root package name */
        public boolean f77270u;

        /* renamed from: v, reason: collision with root package name */
        public int f77271v;

        /* renamed from: w, reason: collision with root package name */
        public int f77272w;

        /* renamed from: x, reason: collision with root package name */
        public String f77273x;

        /* renamed from: y, reason: collision with root package name */
        public String f77274y;

        /* renamed from: z, reason: collision with root package name */
        public x3.e f77275z;

        public b(Menu menu) {
            this.f77250a = menu;
            resetGroup();
        }

        public final Object a(String str, Class[] clsArr, Object[] objArr) throws NoSuchMethodException, SecurityException {
            try {
                Constructor<?> constructor = Class.forName(str, false, h.this.f77245c.getClassLoader()).getConstructor(clsArr);
                constructor.setAccessible(true);
                return constructor.newInstance(objArr);
            } catch (Exception e10) {
                Log.w("SupportMenuInflater", "Cannot instantiate class: " + str, e10);
                return null;
            }
        }

        public void addItem() throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
            this.f77257h = true;
            b(this.f77250a.add(this.f77251b, this.f77258i, this.f77259j, this.f77260k));
        }

        public SubMenu addSubMenuItem() throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
            this.f77257h = true;
            SubMenu subMenuAddSubMenu = this.f77250a.addSubMenu(this.f77251b, this.f77258i, this.f77259j, this.f77260k);
            b(subMenuAddSubMenu.getItem());
            return subMenuAddSubMenu;
        }

        public final void b(MenuItem menuItem) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
            boolean z10 = false;
            menuItem.setChecked(this.f77268s).setVisible(this.f77269t).setEnabled(this.f77270u).setCheckable(this.f77267r >= 1).setTitleCondensed(this.f77261l).setIcon(this.f77262m);
            int i10 = this.f77271v;
            if (i10 >= 0) {
                menuItem.setShowAsAction(i10);
            }
            String str = this.f77274y;
            h hVar = h.this;
            if (str != null) {
                if (hVar.f77245c.isRestricted()) {
                    throw new IllegalStateException("The android:onClick attribute cannot be used within a restricted context");
                }
                if (hVar.f77246d == null) {
                    hVar.f77246d = h.a(hVar.f77245c);
                }
                menuItem.setOnMenuItemClickListener(new a(hVar.f77246d, this.f77274y));
            }
            if (this.f77267r >= 2) {
                if (menuItem instanceof q) {
                    ((q) menuItem).setExclusiveCheckable(true);
                } else if (menuItem instanceof v) {
                    ((v) menuItem).setExclusiveCheckable(true);
                }
            }
            String str2 = this.f77273x;
            if (str2 != null) {
                menuItem.setActionView((View) a(str2, h.f77241e, hVar.f77243a));
                z10 = true;
            }
            int i11 = this.f77272w;
            if (i11 > 0) {
                if (z10) {
                    Log.w("SupportMenuInflater", "Ignoring attribute 'itemActionViewLayout'. Action view already specified.");
                } else {
                    menuItem.setActionView(i11);
                }
            }
            x3.e eVar = this.f77275z;
            if (eVar != null) {
                f0.setActionProvider(menuItem, eVar);
            }
            f0.setContentDescription(menuItem, this.A);
            f0.setTooltipText(menuItem, this.B);
            f0.setAlphabeticShortcut(menuItem, this.f77263n, this.f77264o);
            f0.setNumericShortcut(menuItem, this.f77265p, this.f77266q);
            PorterDuff.Mode mode = this.D;
            if (mode != null) {
                f0.setIconTintMode(menuItem, mode);
            }
            ColorStateList colorStateList = this.C;
            if (colorStateList != null) {
                f0.setIconTintList(menuItem, colorStateList);
            }
        }

        public boolean hasAddedItem() {
            return this.f77257h;
        }

        public void readGroup(AttributeSet attributeSet) {
            TypedArray typedArrayObtainStyledAttributes = h.this.f77245c.obtainStyledAttributes(attributeSet, k.a.f69993q);
            this.f77251b = typedArrayObtainStyledAttributes.getResourceId(1, 0);
            this.f77252c = typedArrayObtainStyledAttributes.getInt(3, 0);
            this.f77253d = typedArrayObtainStyledAttributes.getInt(4, 0);
            this.f77254e = typedArrayObtainStyledAttributes.getInt(5, 0);
            this.f77255f = typedArrayObtainStyledAttributes.getBoolean(2, true);
            this.f77256g = typedArrayObtainStyledAttributes.getBoolean(0, true);
            typedArrayObtainStyledAttributes.recycle();
        }

        public void readItem(AttributeSet attributeSet) {
            h hVar = h.this;
            n3 n3VarObtainStyledAttributes = n3.obtainStyledAttributes(hVar.f77245c, attributeSet, k.a.f69994r);
            this.f77258i = n3VarObtainStyledAttributes.getResourceId(2, 0);
            this.f77259j = (n3VarObtainStyledAttributes.getInt(5, this.f77252c) & (-65536)) | (n3VarObtainStyledAttributes.getInt(6, this.f77253d) & Settings.DEFAULT_INITIAL_WINDOW_SIZE);
            this.f77260k = n3VarObtainStyledAttributes.getText(7);
            this.f77261l = n3VarObtainStyledAttributes.getText(8);
            this.f77262m = n3VarObtainStyledAttributes.getResourceId(0, 0);
            String string = n3VarObtainStyledAttributes.getString(9);
            this.f77263n = string == null ? (char) 0 : string.charAt(0);
            this.f77264o = n3VarObtainStyledAttributes.getInt(16, 4096);
            String string2 = n3VarObtainStyledAttributes.getString(10);
            this.f77265p = string2 == null ? (char) 0 : string2.charAt(0);
            this.f77266q = n3VarObtainStyledAttributes.getInt(20, 4096);
            if (n3VarObtainStyledAttributes.hasValue(11)) {
                this.f77267r = n3VarObtainStyledAttributes.getBoolean(11, false) ? 1 : 0;
            } else {
                this.f77267r = this.f77254e;
            }
            this.f77268s = n3VarObtainStyledAttributes.getBoolean(3, false);
            this.f77269t = n3VarObtainStyledAttributes.getBoolean(4, this.f77255f);
            this.f77270u = n3VarObtainStyledAttributes.getBoolean(1, this.f77256g);
            this.f77271v = n3VarObtainStyledAttributes.getInt(21, -1);
            this.f77274y = n3VarObtainStyledAttributes.getString(12);
            this.f77272w = n3VarObtainStyledAttributes.getResourceId(13, 0);
            this.f77273x = n3VarObtainStyledAttributes.getString(15);
            String string3 = n3VarObtainStyledAttributes.getString(14);
            boolean z10 = string3 != null;
            if (z10 && this.f77272w == 0 && this.f77273x == null) {
                this.f77275z = (x3.e) a(string3, h.f77242f, hVar.f77244b);
            } else {
                if (z10) {
                    Log.w("SupportMenuInflater", "Ignoring attribute 'actionProviderClass'. Action view already specified.");
                }
                this.f77275z = null;
            }
            this.A = n3VarObtainStyledAttributes.getText(17);
            this.B = n3VarObtainStyledAttributes.getText(22);
            if (n3VarObtainStyledAttributes.hasValue(19)) {
                this.D = l1.parseTintMode(n3VarObtainStyledAttributes.getInt(19, -1), this.D);
            } else {
                this.D = null;
            }
            if (n3VarObtainStyledAttributes.hasValue(18)) {
                this.C = n3VarObtainStyledAttributes.getColorStateList(18);
            } else {
                this.C = null;
            }
            n3VarObtainStyledAttributes.recycle();
            this.f77257h = false;
        }

        public void resetGroup() {
            this.f77251b = 0;
            this.f77252c = 0;
            this.f77253d = 0;
            this.f77254e = 0;
            this.f77255f = true;
            this.f77256g = true;
        }
    }

    static {
        Class[] clsArr = {Context.class};
        f77241e = clsArr;
        f77242f = clsArr;
    }

    public h(Context context) {
        super(context);
        this.f77245c = context;
        Object[] objArr = {context};
        this.f77243a = objArr;
        this.f77244b = objArr;
    }

    public static Object a(Object obj) {
        return (!(obj instanceof Activity) && (obj instanceof ContextWrapper)) ? a(((ContextWrapper) obj).getBaseContext()) : obj;
    }

    public final void b(XmlPullParser xmlPullParser, AttributeSet attributeSet, Menu menu) throws XmlPullParserException, IllegalAccessException, IOException, IllegalArgumentException, InvocationTargetException {
        b bVar = new b(menu);
        int eventType = xmlPullParser.getEventType();
        while (true) {
            if (eventType == 2) {
                String name = xmlPullParser.getName();
                if (!name.equals("menu")) {
                    throw new RuntimeException("Expecting menu, got ".concat(name));
                }
                eventType = xmlPullParser.next();
            } else {
                eventType = xmlPullParser.next();
                if (eventType == 1) {
                    break;
                }
            }
        }
        boolean z10 = false;
        boolean z11 = false;
        String str = null;
        while (!z10) {
            if (eventType == 1) {
                throw new RuntimeException("Unexpected end of document");
            }
            if (eventType != 2) {
                if (eventType == 3) {
                    String name2 = xmlPullParser.getName();
                    if (z11 && name2.equals(str)) {
                        z11 = false;
                        str = null;
                    } else if (name2.equals("group")) {
                        bVar.resetGroup();
                    } else if (name2.equals("item")) {
                        if (!bVar.hasAddedItem()) {
                            x3.e eVar = bVar.f77275z;
                            if (eVar == null || !eVar.hasSubMenu()) {
                                bVar.addItem();
                            } else {
                                bVar.addSubMenuItem();
                            }
                        }
                    } else if (name2.equals("menu")) {
                        z10 = true;
                    }
                }
            } else if (!z11) {
                String name3 = xmlPullParser.getName();
                if (name3.equals("group")) {
                    bVar.readGroup(attributeSet);
                } else if (name3.equals("item")) {
                    bVar.readItem(attributeSet);
                } else if (name3.equals("menu")) {
                    b(xmlPullParser, attributeSet, bVar.addSubMenuItem());
                } else {
                    str = name3;
                    z11 = true;
                }
            }
            eventType = xmlPullParser.next();
        }
    }

    @Override // android.view.MenuInflater
    public void inflate(int i10, Menu menu) {
        if (!(menu instanceof q3.a)) {
            super.inflate(i10, menu);
            return;
        }
        XmlResourceParser layout = null;
        boolean z10 = false;
        try {
            try {
                layout = this.f77245c.getResources().getLayout(i10);
                AttributeSet attributeSetAsAttributeSet = Xml.asAttributeSet(layout);
                if (menu instanceof p.m) {
                    p.m mVar = (p.m) menu;
                    if (mVar.isDispatchingItemsChanged()) {
                        mVar.stopDispatchingItemsChanged();
                        z10 = true;
                    }
                }
                b(layout, attributeSetAsAttributeSet, menu);
                if (z10) {
                    ((p.m) menu).startDispatchingItemsChanged();
                }
                layout.close();
            } catch (IOException e10) {
                throw new InflateException("Error inflating menu XML", e10);
            } catch (XmlPullParserException e11) {
                throw new InflateException("Error inflating menu XML", e11);
            }
        } catch (Throwable th2) {
            if (z10) {
                ((p.m) menu).startDispatchingItemsChanged();
            }
            if (layout != null) {
                layout.close();
            }
            throw th2;
        }
    }
}
