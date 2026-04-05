package tm;

import com.amazon.device.ads.DtbConstants;
import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Objects;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class d1 {

    /* renamed from: a, reason: collision with root package name */
    public static final SimpleDateFormat f87011a = new SimpleDateFormat("yyyy-MM-dd'T'HH:mmZ", Locale.US);

    /* renamed from: b, reason: collision with root package name */
    public static final String[] f87012b = {"SU", "MO", "TU", "WE", "TH", "FR", "SA"};

    public static n a(String str) throws JSONException, ParseException {
        JSONObject jSONObject = new JSONObject(str);
        String string = jSONObject.getString("description");
        Objects.requireNonNull(string);
        String string2 = jSONObject.getString("start");
        SimpleDateFormat simpleDateFormat = f87011a;
        Date date = simpleDateFormat.parse(string2);
        Objects.requireNonNull(date);
        n nVar = new n(string, date);
        if (jSONObject.has(DtbConstants.PRIVACY_LOCATION_KEY)) {
            nVar.f87096c = jSONObject.getString(DtbConstants.PRIVACY_LOCATION_KEY);
        }
        if (jSONObject.has("summary")) {
            nVar.f87097d = jSONObject.getString("summary");
        }
        if (jSONObject.has(TtmlNode.END)) {
            nVar.f87098e = simpleDateFormat.parse(jSONObject.getString(TtmlNode.END));
        }
        if (jSONObject.has("status")) {
            nVar.f87099f = jSONObject.getString("status");
        }
        if (jSONObject.has("transparency")) {
            nVar.f87100g = jSONObject.getString("transparency");
        }
        if (jSONObject.has("recurrence")) {
            JSONObject jSONObject2 = jSONObject.getJSONObject("recurrence");
            StringBuilder sb2 = new StringBuilder();
            if (!jSONObject2.isNull("frequency")) {
                try {
                    sb2.append("FREQ=");
                    sb2.append(jSONObject2.getString("frequency"));
                    sb2.append(";");
                } catch (Exception unused) {
                }
            }
            if (!jSONObject2.isNull("interval")) {
                try {
                    sb2.append("INTERVAL=");
                    sb2.append(jSONObject2.getInt("interval"));
                    sb2.append(";");
                } catch (Exception unused2) {
                }
            }
            if (!jSONObject2.isNull("expires")) {
                try {
                    Date date2 = simpleDateFormat.parse(jSONObject2.getString("expires"));
                    sb2.append("UNTIL=");
                    sb2.append(date2);
                    sb2.append(";");
                } catch (Exception unused3) {
                }
            }
            try {
                if (!jSONObject2.isNull("frequency") && "weekly".equalsIgnoreCase(jSONObject2.getString("frequency")) && !jSONObject2.isNull("daysInWeek")) {
                    JSONArray jSONArray = jSONObject2.getJSONArray("daysInWeek");
                    if (jSONArray.length() > 0) {
                        sb2.append("BYDAY=");
                        StringBuilder sb3 = new StringBuilder();
                        for (int i10 = 0; i10 < jSONArray.length(); i10++) {
                            if (i10 > 0) {
                                sb3.append(",");
                            }
                            int i11 = jSONArray.getInt(i10);
                            if (i11 >= 0 && i11 <= 6) {
                                sb3.append(f87012b[i11]);
                            }
                        }
                        sb2.append(sb3.toString());
                        sb2.append(";");
                    }
                }
            } catch (Exception unused4) {
            }
            try {
                if (!jSONObject2.isNull("frequency") && "monthly".equalsIgnoreCase(jSONObject2.getString("frequency"))) {
                    if (!jSONObject2.isNull("daysInMonth")) {
                        JSONArray jSONArray2 = jSONObject2.getJSONArray("daysInMonth");
                        if (jSONArray2.length() > 0) {
                            sb2.append("BYMONTHDAY=");
                            sb2.append(b(jSONArray2));
                            sb2.append(";");
                        }
                    }
                    if (!jSONObject2.isNull("weeksInMonth")) {
                        JSONArray jSONArray3 = jSONObject2.getJSONArray("weeksInMonth");
                        if (jSONArray3.length() > 0) {
                            sb2.append("BYWEEKNO=");
                            sb2.append(b(jSONArray3));
                            sb2.append(";");
                        }
                    }
                }
            } catch (Exception unused5) {
            }
            try {
                if (!jSONObject2.isNull("frequency") && "yearly".equalsIgnoreCase(jSONObject2.getString("frequency"))) {
                    if (!jSONObject2.isNull("monthsInYear")) {
                        JSONArray jSONArray4 = jSONObject2.getJSONArray("monthsInYear");
                        if (jSONArray4.length() > 0) {
                            sb2.append("BYMONTH=");
                            sb2.append(b(jSONArray4));
                            sb2.append(";");
                        }
                    }
                    if (!jSONObject2.isNull("daysInYear")) {
                        JSONArray jSONArray5 = jSONObject2.getJSONArray("daysInYear");
                        if (jSONArray5.length() > 0) {
                            sb2.append("BYYEARDAY=");
                            sb2.append(b(jSONArray5));
                            sb2.append(";");
                        }
                    }
                }
            } catch (Exception unused6) {
            }
            nVar.f87101h = sb2.length() > 0 ? sb2.toString() : null;
        }
        return nVar;
    }

    public static String b(JSONArray jSONArray) {
        StringBuilder sb2 = new StringBuilder();
        for (int i10 = 0; i10 < jSONArray.length(); i10++) {
            if (i10 > 0) {
                sb2.append(",");
            }
            sb2.append(jSONArray.get(i10).toString());
        }
        return sb2.toString();
    }
}
