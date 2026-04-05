package pb;

import android.content.Context;
import android.util.Xml;
import java.io.IOException;
import java.io.InputStream;
import lb.a1;
import lb.b1;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class a {

    /* renamed from: a, reason: collision with root package name */
    public final Context f80933a;

    /* renamed from: b, reason: collision with root package name */
    public InputStream f80934b = null;

    public a(b1.b bVar, Context context) {
        this.f80933a = context;
    }

    public void init(InputStream inputStream) {
        this.f80934b = inputStream;
    }

    public int testNodeCompletion() throws XmlPullParserException, IOException {
        int iTestNodeCompletion;
        XmlPullParser xmlPullParserNewPullParser = Xml.newPullParser();
        int i10 = 0;
        try {
            xmlPullParserNewPullParser.setFeature("http://xmlpull.org/v1/doc/features.html#process-namespaces", false);
            xmlPullParserNewPullParser.setInput(this.f80934b, null);
            String applicationLanguage = b1.sharedInstance().getApplicationLanguage();
            String applicationTradsId = b1.sharedInstance().getApplicationTradsId();
            iTestNodeCompletion = 0;
            String text = null;
            String str = null;
            String str2 = null;
            boolean z10 = true;
            for (int eventType = xmlPullParserNewPullParser.getEventType(); eventType != 1 && z10; eventType = xmlPullParserNewPullParser.next()) {
                try {
                    String name = xmlPullParserNewPullParser.getName();
                    if (eventType == 2) {
                        name.equalsIgnoreCase("ELEMENT");
                    } else if (eventType != 3) {
                        if (eventType == 4) {
                            text = xmlPullParserNewPullParser.getText();
                        }
                    } else if (name.equalsIgnoreCase("COMPLETION")) {
                        if (text == null || text.equals("")) {
                            iTestNodeCompletion = 400;
                        } else {
                            iTestNodeCompletion = a1.testNodeCompletion(text);
                            if (iTestNodeCompletion != 0) {
                            }
                        }
                        z10 = false;
                    } else if (name.equalsIgnoreCase("ELEMENT")) {
                        if (str != null && str2 != null) {
                            mb.a.sharedInstance().addOneTradToSave(new b1.c(applicationLanguage, applicationTradsId, str, str2));
                            str = null;
                            str2 = null;
                        }
                    } else if (name.equalsIgnoreCase("MARQUEUR")) {
                        str = text;
                    } else if (name.equalsIgnoreCase("LIBELLE")) {
                        str2 = text;
                    }
                } catch (IOException e10) {
                    e = e10;
                    i10 = iTestNodeCompletion;
                    e.printStackTrace();
                    iTestNodeCompletion = i10;
                    this.f80934b.close();
                    return iTestNodeCompletion;
                } catch (XmlPullParserException e11) {
                    e = e11;
                    i10 = iTestNodeCompletion;
                    e.printStackTrace();
                    iTestNodeCompletion = i10;
                    this.f80934b.close();
                    return iTestNodeCompletion;
                }
            }
            mb.a.sharedInstance().saveTradsToSave();
        } catch (IOException e12) {
            e = e12;
        } catch (XmlPullParserException e13) {
            e = e13;
        }
        try {
            this.f80934b.close();
        } catch (IOException e14) {
            e14.printStackTrace();
        }
        return iTestNodeCompletion;
    }
}
