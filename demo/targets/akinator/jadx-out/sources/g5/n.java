package g5;

import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.content.res.XmlResourceParser;
import android.util.AttributeSet;
import android.util.Xml;
import android.view.InflateException;
import androidx.preference.Preference;
import androidx.preference.PreferenceGroup;
import androidx.preference.SwitchPreference;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.util.HashMap;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public class n {

    /* renamed from: e, reason: collision with root package name */
    public static final Class[] f57295e = {Context.class, AttributeSet.class};

    /* renamed from: f, reason: collision with root package name */
    public static final HashMap f57296f = new HashMap();

    /* renamed from: a, reason: collision with root package name */
    public final Context f57297a;

    /* renamed from: b, reason: collision with root package name */
    public final Object[] f57298b = new Object[2];

    /* renamed from: c, reason: collision with root package name */
    public final r f57299c;

    /* renamed from: d, reason: collision with root package name */
    public String[] f57300d;

    public n(Context context, r rVar) {
        this.f57297a = context;
        this.f57299c = rVar;
        setDefaultPackages(new String[]{Preference.class.getPackage().getName() + ".", SwitchPreference.class.getPackage().getName() + "."});
    }

    public final Preference a(String str, String[] strArr, AttributeSet attributeSet) throws NoSuchMethodException, ClassNotFoundException, SecurityException {
        Class<?> cls;
        HashMap map = f57296f;
        Constructor<?> constructor = (Constructor) map.get(str);
        if (constructor == null) {
            try {
                try {
                    ClassLoader classLoader = this.f57297a.getClassLoader();
                    if (strArr == null || strArr.length == 0) {
                        cls = Class.forName(str, false, classLoader);
                    } else {
                        cls = null;
                        ClassNotFoundException e10 = null;
                        for (String str2 : strArr) {
                            try {
                                cls = Class.forName(str2 + str, false, classLoader);
                                break;
                            } catch (ClassNotFoundException e11) {
                                e10 = e11;
                            }
                        }
                        if (cls == null) {
                            if (e10 != null) {
                                throw e10;
                            }
                            throw new InflateException(attributeSet.getPositionDescription() + ": Error inflating class " + str);
                        }
                    }
                    constructor = cls.getConstructor(f57295e);
                    constructor.setAccessible(true);
                    map.put(str, constructor);
                } catch (Exception e12) {
                    InflateException inflateException = new InflateException(attributeSet.getPositionDescription() + ": Error inflating class " + str);
                    inflateException.initCause(e12);
                    throw inflateException;
                }
            } catch (ClassNotFoundException e13) {
                throw e13;
            }
        }
        Object[] objArr = this.f57298b;
        objArr[1] = attributeSet;
        return (Preference) constructor.newInstance(objArr);
    }

    public final Preference b(String str, AttributeSet attributeSet) {
        try {
            return -1 == str.indexOf(46) ? a(str, this.f57300d, attributeSet) : a(str, null, attributeSet);
        } catch (InflateException e10) {
            throw e10;
        } catch (ClassNotFoundException e11) {
            InflateException inflateException = new InflateException(attributeSet.getPositionDescription() + ": Error inflating class (not found)" + str);
            inflateException.initCause(e11);
            throw inflateException;
        } catch (Exception e12) {
            InflateException inflateException2 = new InflateException(attributeSet.getPositionDescription() + ": Error inflating class " + str);
            inflateException2.initCause(e12);
            throw inflateException2;
        }
    }

    public final void c(XmlPullParser xmlPullParser, Preference preference, AttributeSet attributeSet) throws XmlPullParserException, IOException {
        int depth = xmlPullParser.getDepth();
        while (true) {
            int next = xmlPullParser.next();
            if ((next == 3 && xmlPullParser.getDepth() <= depth) || next == 1) {
                return;
            }
            if (next == 2) {
                String name = xmlPullParser.getName();
                if ("intent".equals(name)) {
                    try {
                        preference.setIntent(Intent.parseIntent(getContext().getResources(), xmlPullParser, attributeSet));
                    } catch (IOException e10) {
                        XmlPullParserException xmlPullParserException = new XmlPullParserException("Error parsing preference");
                        xmlPullParserException.initCause(e10);
                        throw xmlPullParserException;
                    }
                } else if ("extra".equals(name)) {
                    getContext().getResources().parseBundleExtra("extra", attributeSet, preference.getExtras());
                    try {
                        int depth2 = xmlPullParser.getDepth();
                        while (true) {
                            int next2 = xmlPullParser.next();
                            if (next2 == 1 || (next2 == 3 && xmlPullParser.getDepth() <= depth2)) {
                                break;
                            }
                        }
                    } catch (IOException e11) {
                        XmlPullParserException xmlPullParserException2 = new XmlPullParserException("Error parsing preference");
                        xmlPullParserException2.initCause(e11);
                        throw xmlPullParserException2;
                    }
                } else {
                    Preference preferenceB = b(name, attributeSet);
                    ((PreferenceGroup) preference).addItemFromInflater(preferenceB);
                    c(xmlPullParser, preferenceB, attributeSet);
                }
            }
        }
    }

    public Context getContext() {
        return this.f57297a;
    }

    public String[] getDefaultPackages() {
        return this.f57300d;
    }

    public Preference inflate(int i10, PreferenceGroup preferenceGroup) throws Resources.NotFoundException {
        XmlResourceParser xml = getContext().getResources().getXml(i10);
        try {
            return inflate(xml, preferenceGroup);
        } finally {
            xml.close();
        }
    }

    public void setDefaultPackages(String[] strArr) {
        this.f57300d = strArr;
    }

    public Preference inflate(XmlPullParser xmlPullParser, PreferenceGroup preferenceGroup) {
        int next;
        synchronized (this.f57298b) {
            AttributeSet attributeSetAsAttributeSet = Xml.asAttributeSet(xmlPullParser);
            this.f57298b[0] = this.f57297a;
            do {
                try {
                    try {
                        try {
                            next = xmlPullParser.next();
                            if (next == 2) {
                                break;
                            }
                        } catch (IOException e10) {
                            InflateException inflateException = new InflateException(xmlPullParser.getPositionDescription() + ": " + e10.getMessage());
                            inflateException.initCause(e10);
                            throw inflateException;
                        }
                    } catch (InflateException e11) {
                        throw e11;
                    }
                } catch (XmlPullParserException e12) {
                    InflateException inflateException2 = new InflateException(e12.getMessage());
                    inflateException2.initCause(e12);
                    throw inflateException2;
                }
            } while (next != 1);
            if (next == 2) {
                PreferenceGroup preferenceGroup2 = (PreferenceGroup) b(xmlPullParser.getName(), attributeSetAsAttributeSet);
                if (preferenceGroup == null) {
                    preferenceGroup2.e(this.f57299c);
                    preferenceGroup = preferenceGroup2;
                }
                c(xmlPullParser, preferenceGroup, attributeSetAsAttributeSet);
            } else {
                throw new InflateException(xmlPullParser.getPositionDescription() + ": No start tag found!");
            }
        }
        return preferenceGroup;
    }
}
