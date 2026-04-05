package g3;

import android.content.Context;
import android.util.Log;
import android.util.Xml;
import androidx.constraintlayout.widget.ConstraintLayout;
import hr.kNq.ikJMrW;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes2.dex */
public class i {

    /* renamed from: b, reason: collision with root package name */
    public static final HashMap f56978b;

    /* renamed from: a, reason: collision with root package name */
    public final HashMap f56979a;

    static {
        HashMap map = new HashMap();
        f56978b = map;
        try {
            map.put("KeyAttribute", f.class.getConstructor(null));
            map.put("KeyPosition", k.class.getConstructor(null));
            map.put("KeyCycle", h.class.getConstructor(null));
            map.put("KeyTimeCycle", n.class.getConstructor(null));
            map.put("KeyTrigger", p.class.getConstructor(null));
        } catch (NoSuchMethodException e10) {
            Log.e("KeyFrames", "unable to load", e10);
        }
    }

    public i() {
        this.f56979a = new HashMap();
    }

    public void addAllFrames(s sVar) {
        ArrayList arrayList = (ArrayList) this.f56979a.get(-1);
        if (arrayList != null) {
            sVar.f57242w.addAll(arrayList);
        }
    }

    public void addFrames(s sVar) {
        Integer numValueOf = Integer.valueOf(sVar.f57222c);
        HashMap map = this.f56979a;
        ArrayList arrayList = (ArrayList) map.get(numValueOf);
        if (arrayList != null) {
            sVar.f57242w.addAll(arrayList);
        }
        ArrayList arrayList2 = (ArrayList) map.get(-1);
        if (arrayList2 != null) {
            Iterator it = arrayList2.iterator();
            while (it.hasNext()) {
                d dVar = (d) it.next();
                String str = ((ConstraintLayout.a) sVar.f57221b.getLayoutParams()).Y;
                String str2 = dVar.f56927c;
                if ((str2 == null || str == null) ? false : str.matches(str2)) {
                    sVar.addKey(dVar);
                }
            }
        }
    }

    public void addKey(d dVar) {
        Integer numValueOf = Integer.valueOf(dVar.f56926b);
        HashMap map = this.f56979a;
        if (!map.containsKey(numValueOf)) {
            map.put(Integer.valueOf(dVar.f56926b), new ArrayList());
        }
        ArrayList arrayList = (ArrayList) map.get(Integer.valueOf(dVar.f56926b));
        if (arrayList != null) {
            arrayList.add(dVar);
        }
    }

    public ArrayList<d> getKeyFramesForView(int i10) {
        return (ArrayList) this.f56979a.get(Integer.valueOf(i10));
    }

    public Set<Integer> getKeys() {
        return this.f56979a.keySet();
    }

    public i(Context context, XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
        int eventType;
        d dVar;
        HashMap map;
        HashMap map2;
        d nVar;
        String str = ikJMrW.WVyoPOvUQKGRkYW;
        this.f56979a = new HashMap();
        try {
            eventType = xmlPullParser.getEventType();
            dVar = null;
        } catch (IOException e10) {
            Log.e("KeyFrames", str, e10);
            return;
        } catch (XmlPullParserException e11) {
            Log.e("KeyFrames", str, e11);
            return;
        }
        while (eventType != 1) {
            if (eventType != 2) {
                if (eventType == 3 && "KeyFrameSet".equals(xmlPullParser.getName())) {
                    return;
                }
            } else {
                String name = xmlPullParser.getName();
                if (f56978b.containsKey(name)) {
                    switch (name.hashCode()) {
                        case -300573030:
                            if (name.equals("KeyTimeCycle")) {
                                nVar = new n();
                                nVar.load(context, Xml.asAttributeSet(xmlPullParser));
                                addKey(nVar);
                                dVar = nVar;
                                break;
                            } else {
                                throw new NullPointerException("Key " + name + " not found");
                            }
                        case -298435811:
                            if (name.equals("KeyAttribute")) {
                                nVar = new f();
                                nVar.load(context, Xml.asAttributeSet(xmlPullParser));
                                addKey(nVar);
                                dVar = nVar;
                                break;
                            } else {
                                throw new NullPointerException("Key " + name + " not found");
                            }
                        case 540053991:
                            if (name.equals("KeyCycle")) {
                                nVar = new h();
                                nVar.load(context, Xml.asAttributeSet(xmlPullParser));
                                addKey(nVar);
                                dVar = nVar;
                                break;
                            } else {
                                throw new NullPointerException("Key " + name + " not found");
                            }
                        case 1153397896:
                            if (name.equals("KeyPosition")) {
                                nVar = new k();
                                nVar.load(context, Xml.asAttributeSet(xmlPullParser));
                                addKey(nVar);
                                dVar = nVar;
                                break;
                            } else {
                                throw new NullPointerException("Key " + name + " not found");
                            }
                        case 1308496505:
                            if (name.equals("KeyTrigger")) {
                                nVar = new p();
                                nVar.load(context, Xml.asAttributeSet(xmlPullParser));
                                addKey(nVar);
                                dVar = nVar;
                                break;
                            } else {
                                throw new NullPointerException("Key " + name + " not found");
                            }
                        default:
                            throw new NullPointerException("Key " + name + " not found");
                    }
                    return;
                }
                if (name.equalsIgnoreCase("CustomAttribute")) {
                    if (dVar != null && (map2 = dVar.f56929e) != null) {
                        androidx.constraintlayout.widget.b.parse(context, xmlPullParser, map2);
                    }
                } else if (name.equalsIgnoreCase("CustomMethod") && dVar != null && (map = dVar.f56929e) != null) {
                    androidx.constraintlayout.widget.b.parse(context, xmlPullParser, map);
                }
            }
            eventType = xmlPullParser.next();
        }
    }
}
