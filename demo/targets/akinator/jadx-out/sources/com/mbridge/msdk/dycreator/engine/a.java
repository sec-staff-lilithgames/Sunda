package com.mbridge.msdk.dycreator.engine;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.XmlResourceParser;
import android.util.AttributeSet;
import android.util.Xml;
import android.view.InflateException;
import android.view.View;
import android.view.ViewGroup;
import com.ironsource.G5;
import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;
import io.bidmachine.nativead.view.ev.QGjYBESwAiCc;
import j1.o2;
import java.io.FileInputStream;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.util.HashMap;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public class a {

    /* renamed from: e, reason: collision with root package name */
    private static final Class[] f40193e = {Context.class, AttributeSet.class};

    /* renamed from: f, reason: collision with root package name */
    private static final HashMap<String, Constructor> f40194f = new HashMap<>();

    /* renamed from: g, reason: collision with root package name */
    private static String f40195g = "com.mbridge.msdk.dycreator.baseview.MB";

    /* renamed from: b, reason: collision with root package name */
    protected final Context f40197b;

    /* renamed from: d, reason: collision with root package name */
    private long f40199d;

    /* renamed from: a, reason: collision with root package name */
    private final boolean f40196a = true;

    /* renamed from: c, reason: collision with root package name */
    private final Object[] f40198c = new Object[2];

    public a(Context context) {
        this.f40197b = context;
    }

    public Context a() {
        return this.f40197b;
    }

    public View b(String str, AttributeSet attributeSet) throws ClassNotFoundException {
        return (str.equals("MBStarLevelLayoutView") || str.equals("LuckPan")) ? a(str, "", attributeSet) : a(str, f40195g, attributeSet);
    }

    public View a(String str, ViewGroup viewGroup) {
        return a(str, viewGroup, viewGroup != null);
    }

    public View a(String str, ViewGroup viewGroup, boolean z10) {
        this.f40199d = System.currentTimeMillis();
        System.out.println("INFLATING from resource: " + str);
        return a(a(str), viewGroup, z10);
    }

    private void b(XmlPullParser xmlPullParser, View view, AttributeSet attributeSet) throws XmlPullParserException, Resources.NotFoundException, IOException {
        int depth = xmlPullParser.getDepth();
        while (true) {
            int next = xmlPullParser.next();
            if ((next == 3 && xmlPullParser.getDepth() <= depth) || next == 1) {
                return;
            }
            if (next == 2) {
                String name = xmlPullParser.getName();
                if ("requestFocus".equals(name)) {
                    a(xmlPullParser, view);
                } else if ("include".equals(name)) {
                    if (xmlPullParser.getDepth() != 0) {
                        a(xmlPullParser, view, attributeSet);
                    } else {
                        throw new InflateException("<include /> cannot be the root element");
                    }
                } else if (!"merge".equals(name)) {
                    View viewA = a(name, attributeSet);
                    ViewGroup viewGroup = (ViewGroup) view;
                    ViewGroup.LayoutParams layoutParamsGenerateLayoutParams = viewGroup.generateLayoutParams(attributeSet);
                    b(xmlPullParser, viewA, attributeSet);
                    viewGroup.addView(viewA, layoutParamsGenerateLayoutParams);
                } else {
                    throw new InflateException("<merge /> must be the root element");
                }
            }
        }
    }

    public XmlPullParser a(String str) throws XmlPullParserException {
        XmlPullParser xmlPullParserNewPullParser = Xml.newPullParser();
        try {
            xmlPullParserNewPullParser.setInput(new FileInputStream(str), G5.N);
            return xmlPullParserNewPullParser;
        } catch (Exception e10) {
            e10.printStackTrace();
            return xmlPullParserNewPullParser;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v0, types: [android.view.View, android.view.ViewGroup, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v4 */
    /* JADX WARN: Type inference failed for: r8v5, types: [android.view.View] */
    public View a(XmlPullParser xmlPullParser, ViewGroup viewGroup, boolean z10) {
        int next;
        ViewGroup.LayoutParams layoutParamsGenerateLayoutParams;
        synchronized (this.f40198c) {
            try {
                AttributeSet attributeSetAsAttributeSet = Xml.asAttributeSet(xmlPullParser);
                this.f40198c[0] = this.f40197b;
                do {
                    next = xmlPullParser.next();
                    if (next == 2) {
                        break;
                    }
                } while (next != 1);
                if (next == 2) {
                    String name = xmlPullParser.getName();
                    System.out.println("**************************");
                    System.out.println("Creating root view: " + name);
                    System.out.println("**************************");
                    if (!"merge".equals(name)) {
                        View viewA = a(name, attributeSetAsAttributeSet);
                        if (viewGroup != 0) {
                            System.out.println(QGjYBESwAiCc.CvSAmrMyLEAxpn + ((Object) viewGroup));
                            layoutParamsGenerateLayoutParams = viewGroup.generateLayoutParams(attributeSetAsAttributeSet);
                            if (!z10) {
                                viewA.setLayoutParams(layoutParamsGenerateLayoutParams);
                            }
                        } else {
                            layoutParamsGenerateLayoutParams = null;
                        }
                        System.out.println("-----> start inflating children");
                        b(xmlPullParser, viewA, attributeSetAsAttributeSet);
                        System.out.println("-----> done inflating children");
                        if (viewGroup != 0 && z10) {
                            viewGroup.addView(viewA, layoutParamsGenerateLayoutParams);
                        }
                        if (viewGroup == 0 || !z10) {
                            viewGroup = viewA;
                        }
                    } else if (viewGroup != 0 && z10) {
                        b(xmlPullParser, viewGroup, attributeSetAsAttributeSet);
                    } else {
                        throw new InflateException("<merge /> can be used only with a valid ViewGroup root and attachToRoot=true");
                    }
                } else {
                    throw new InflateException(xmlPullParser.getPositionDescription() + ": No start tag found!");
                }
            } catch (IOException e10) {
                InflateException inflateException = new InflateException(xmlPullParser.getPositionDescription() + ": " + e10.getMessage());
                inflateException.initCause(e10);
                throw inflateException;
            } catch (XmlPullParserException e11) {
                InflateException inflateException2 = new InflateException(e11.getMessage());
                inflateException2.initCause(e11);
                throw inflateException2;
            } finally {
            }
        }
        return viewGroup;
    }

    public final View a(String str, String str2, AttributeSet attributeSet) throws InflateException, NoSuchMethodException, ClassNotFoundException, SecurityException {
        String str3;
        HashMap<String, Constructor> map = f40194f;
        Constructor<?> constructor = map.get(str);
        Class<?> clsLoadClass = null;
        if (constructor == null) {
            try {
                ClassLoader classLoader = this.f40197b.getClassLoader();
                if (str2 != null) {
                    str3 = str2 + str;
                } else {
                    str3 = str;
                }
                clsLoadClass = classLoader.loadClass(str3);
                constructor = clsLoadClass.getConstructor(f40193e);
                map.put(str, constructor);
            } catch (ClassNotFoundException e10) {
                throw e10;
            } catch (NoSuchMethodException e11) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(attributeSet.getPositionDescription());
                sb2.append(": Error inflating class ");
                if (str2 != null) {
                    str = o2.l(str2, str);
                }
                sb2.append(str);
                InflateException inflateException = new InflateException(sb2.toString());
                inflateException.initCause(e11);
                throw inflateException;
            } catch (Exception e12) {
                StringBuilder sb3 = new StringBuilder();
                sb3.append(attributeSet.getPositionDescription());
                sb3.append(": Error inflating class ");
                sb3.append(clsLoadClass == null ? "<unknown>" : clsLoadClass.getName());
                InflateException inflateException2 = new InflateException(sb3.toString());
                inflateException2.initCause(e12);
                throw inflateException2;
            }
        }
        Object[] objArr = this.f40198c;
        objArr[1] = attributeSet;
        return (View) constructor.newInstance(objArr);
    }

    public View a(String str, AttributeSet attributeSet) {
        View viewA;
        if (str.equals("view")) {
            str = attributeSet.getAttributeValue(null, "class");
        }
        System.out.println("******** Creating view: " + str);
        try {
            if (-1 == str.indexOf(46)) {
                viewA = b(str, attributeSet);
            } else {
                viewA = a(str, (String) null, attributeSet);
            }
            System.out.println("Created view is: " + viewA);
            return viewA;
        } catch (InflateException e10) {
            throw e10;
        } catch (ClassNotFoundException e11) {
            InflateException inflateException = new InflateException(attributeSet.getPositionDescription() + ": Error inflating class " + str);
            inflateException.initCause(e11);
            throw inflateException;
        } catch (Exception e12) {
            InflateException inflateException2 = new InflateException(attributeSet.getPositionDescription() + ": Error inflating class " + str);
            inflateException2.initCause(e12);
            throw inflateException2;
        }
    }

    private void a(XmlPullParser xmlPullParser, View view) throws XmlPullParserException, IOException {
        int next;
        view.requestFocus();
        int depth = xmlPullParser.getDepth();
        do {
            next = xmlPullParser.next();
            if (next == 3 && xmlPullParser.getDepth() <= depth) {
                return;
            }
        } while (next != 1);
    }

    private void a(XmlPullParser xmlPullParser, View view, AttributeSet attributeSet) throws XmlPullParserException, Resources.NotFoundException, IOException {
        int next;
        ViewGroup.LayoutParams layoutParamsGenerateLayoutParams;
        int next2;
        if (view instanceof ViewGroup) {
            int attributeResourceValue = attributeSet.getAttributeResourceValue(null, TtmlNode.TAG_LAYOUT, 0);
            if (attributeResourceValue == 0) {
                String attributeValue = attributeSet.getAttributeValue(null, TtmlNode.TAG_LAYOUT);
                if (attributeValue == null) {
                    throw new InflateException("You must specifiy a layout in the include tag: <include layout=\"@layout/layoutID\" />");
                }
                throw new InflateException(a.b.l("You must specifiy a valid layout reference. The layout ID ", attributeValue, " is not valid."));
            }
            XmlResourceParser layout = a().getResources().getLayout(attributeResourceValue);
            try {
                AttributeSet attributeSetAsAttributeSet = Xml.asAttributeSet(layout);
                do {
                    next = layout.next();
                    if (next == 2) {
                        break;
                    }
                } while (next != 1);
                if (next == 2) {
                    String name = layout.getName();
                    if ("merge".equals(name)) {
                        b(layout, view, attributeSetAsAttributeSet);
                    } else {
                        View viewA = a(name, attributeSetAsAttributeSet);
                        ViewGroup viewGroup = (ViewGroup) view;
                        try {
                            layoutParamsGenerateLayoutParams = viewGroup.generateLayoutParams(attributeSet);
                        } catch (RuntimeException unused) {
                            layoutParamsGenerateLayoutParams = viewGroup.generateLayoutParams(attributeSetAsAttributeSet);
                            if (layoutParamsGenerateLayoutParams != null) {
                            }
                        }
                        if (layoutParamsGenerateLayoutParams != null) {
                            viewA.setLayoutParams(layoutParamsGenerateLayoutParams);
                        }
                        b(layout, viewA, attributeSetAsAttributeSet);
                        viewGroup.addView(viewA);
                    }
                    layout.close();
                    int depth = xmlPullParser.getDepth();
                    do {
                        next2 = xmlPullParser.next();
                        if (next2 == 3 && xmlPullParser.getDepth() <= depth) {
                            return;
                        }
                    } while (next2 != 1);
                    return;
                }
                throw new InflateException(layout.getPositionDescription() + ": No start tag found!");
            } catch (Throwable th2) {
                layout.close();
                throw th2;
            }
        }
        throw new InflateException("<include /> can only be used inside of a ViewGroup");
    }
}
