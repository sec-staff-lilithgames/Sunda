package pr;

import android.location.Location;
import android.text.TextUtils;
import android.util.Base64;
import com.explorestack.protobuf.Any;
import com.explorestack.protobuf.ListValue;
import com.explorestack.protobuf.MessageLite;
import com.explorestack.protobuf.Struct;
import com.explorestack.protobuf.Timestamp;
import com.explorestack.protobuf.Value;
import com.explorestack.protobuf.adcom.Ad;
import com.explorestack.protobuf.adcom.Context;
import com.explorestack.protobuf.adcom.EventType;
import com.explorestack.protobuf.adcom.LocationType;
import com.explorestack.protobuf.adcom.Placement;
import io.bidmachine.TrackEventType;
import io.bidmachine.protobuf.AdExtension;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public class i {
    public static void addEvent(Map<TrackEventType, List<String>> map, TrackEventType trackEventType, String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        List<String> arrayList = map.get(trackEventType);
        if (arrayList == null) {
            arrayList = new ArrayList<>(1);
            map.put(trackEventType, arrayList);
        }
        arrayList.add(str);
    }

    public static Context.Geo.Builder createGeoBuilderWithLocation(android.content.Context context, Location location, Location location2, boolean z10) {
        Context.Geo.Builder builderNewBuilder = Context.Geo.newBuilder();
        fillGeoBuilder(builderNewBuilder, nm.j.getBestLocation(context, location, location2), z10);
        return builderNewBuilder;
    }

    public static String encodeToString(MessageLite messageLite) {
        if (messageLite == null) {
            return null;
        }
        try {
            return Base64.encodeToString(messageLite.toByteArray(), 2);
        } catch (Exception unused) {
            return null;
        }
    }

    public static void fillGeoBuilder(Context.Geo.Builder builder, Location location, boolean z10) {
        if (z10) {
            builder.setUtcoffset(nm.j.getUtcOffsetMinutes());
        }
        if (location != null) {
            builder.setType(getLocationType(location));
            builder.setLat((float) location.getLatitude());
            builder.setLon((float) location.getLongitude());
            builder.setAccur((int) location.getAccuracy());
            builder.setLastfix(location.getTime());
        }
    }

    public static void fillStructWithPrimitiveValues(Struct.Builder builder, Map<String, Object> map) {
        for (Map.Entry<String, Object> entry : map.entrySet()) {
            Object value = entry.getValue();
            if (value != null) {
                String key = entry.getKey();
                if (value.getClass() == String.class) {
                    builder.putFields(key, Value.newBuilder().setStringValue((String) value).build());
                } else if (value.getClass() == Boolean.class) {
                    builder.putFields(key, Value.newBuilder().setBoolValue(((Boolean) value).booleanValue()).build());
                } else if (value instanceof Number) {
                    builder.putFields(key, Value.newBuilder().setNumberValue(((Number) value).doubleValue()).build());
                }
            }
        }
    }

    public static AdExtension findFirstAdExtension(Ad ad2) {
        Any extProto;
        int extProtoCount = ad2.getExtProtoCount();
        if (extProtoCount <= 0) {
            return null;
        }
        for (int i10 = 0; i10 < extProtoCount; i10++) {
            try {
                extProto = ad2.getExtProto(i10);
            } catch (Throwable th2) {
                nm.a.w(th2);
            }
            if (extProto.is(AdExtension.class)) {
                return (AdExtension) extProto.unpack(AdExtension.class);
            }
            continue;
        }
        return null;
    }

    public static LocationType getLocationType(Location location) {
        if (location != null) {
            if ("gps".equals(location.getProvider())) {
                return LocationType.LOCATION_TYPE_GPS;
            }
            if ("network".equals(location.getProvider()) || "passive".equals(location.getProvider())) {
                return LocationType.LOCATION_TYPE_IP;
            }
        }
        return LocationType.LOCATION_TYPE_INVALID;
    }

    public static boolean isBannerPlacement(Placement placement, mm.g gVar) {
        Placement.DisplayPlacement display = placement.getDisplay();
        return !display.getInstl() && gVar.f74818b == display.getW() && gVar.f74819c == display.getH();
    }

    public static boolean isEmpty(Struct struct) {
        return struct == null || struct.getFieldsCount() <= 0;
    }

    public static boolean isInterstitialPlacement(Placement placement) {
        if (isRewardedPlacement(placement)) {
            return false;
        }
        Placement.DisplayPlacement display = placement.getDisplay();
        if (display == Placement.DisplayPlacement.getDefaultInstance() || !display.getInstl()) {
            return isVideoPlacement(placement);
        }
        return true;
    }

    public static boolean isNativePlacement(Placement placement) {
        return placement.getDisplay().getNativefmt().getAssetCount() > 0;
    }

    public static boolean isRewardedPlacement(Placement placement) {
        return placement.getReward();
    }

    public static boolean isVideoPlacement(Placement placement) {
        return placement.getVideo() != Placement.VideoPlacement.getDefaultInstance();
    }

    public static Timestamp msToProtobufTimestamp(long j10) {
        return Timestamp.newBuilder().setSeconds(j10 / 1000).setNanos(((int) (j10 % 1000)) * 1000000).build();
    }

    public static void prepareEvents(Map<TrackEventType, List<String>> map, List<Ad.Event> list) {
        if (list == null || list.isEmpty()) {
            return;
        }
        for (Ad.Event event : list) {
            TrackEventType trackEventTypeFromNumber = event.getType() == EventType.EVENT_TYPE_IMPRESSION ? TrackEventType.Show : TrackEventType.fromNumber(event.getTypeValue());
            if (trackEventTypeFromNumber != null) {
                addEvent(map, trackEventTypeFromNumber, event.getUrl());
            }
        }
    }

    public static List<Object> toList(ListValue listValue) {
        List<Object> listOrNull = toListOrNull(listValue);
        return listOrNull != null ? listOrNull : new ArrayList();
    }

    public static List<Object> toListOrNull(ListValue listValue) {
        if (isEmpty(listValue)) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        Iterator<Value> it = listValue.getValuesList().iterator();
        while (it.hasNext()) {
            Object objectOrNull = toObjectOrNull(it.next());
            if (objectOrNull != null) {
                arrayList.add(objectOrNull);
            }
        }
        return arrayList;
    }

    public static ListValue.Builder toListValueBuilderOrNull(List<?> list) {
        if (list == null || list.isEmpty()) {
            return null;
        }
        ListValue.Builder builderNewBuilder = ListValue.newBuilder();
        Iterator<?> it = list.iterator();
        while (it.hasNext()) {
            Value.Builder valueBuilderOrNull = toValueBuilderOrNull(it.next());
            if (valueBuilderOrNull != null) {
                builderNewBuilder.addValues(valueBuilderOrNull);
            }
        }
        return builderNewBuilder;
    }

    public static Map<String, Object> toMap(Struct struct) {
        Map<String, Object> mapOrNull = toMapOrNull(struct);
        return mapOrNull != null ? mapOrNull : new HashMap();
    }

    public static Map<String, Object> toMapOrNull(Struct struct) {
        Object objectOrNull;
        if (isEmpty(struct)) {
            return null;
        }
        HashMap map = new HashMap();
        for (Map.Entry<String, Value> entry : struct.getFieldsMap().entrySet()) {
            String key = entry.getKey();
            Value value = entry.getValue();
            if (!TextUtils.isEmpty(key) && value != null && (objectOrNull = toObjectOrNull(value)) != null) {
                map.put(key, objectOrNull);
            }
        }
        return map;
    }

    public static Object toObjectOrNull(Value value) {
        if (value == null) {
            return null;
        }
        int i10 = h.f81816a[value.getKindCase().ordinal()];
        if (i10 == 1) {
            return Double.valueOf(value.getNumberValue());
        }
        if (i10 == 2) {
            return value.getStringValue();
        }
        if (i10 == 3) {
            return Boolean.valueOf(value.getBoolValue());
        }
        if (i10 == 4) {
            return toMapOrNull(value.getStructValue());
        }
        if (i10 != 5) {
            return null;
        }
        return toListOrNull(value.getListValue());
    }

    public static Struct.Builder toStructBuilderOrNull(Map<?, ?> map) {
        Value.Builder valueBuilderOrNull;
        if (map == null || map.isEmpty()) {
            return null;
        }
        Struct.Builder builderNewBuilder = Struct.newBuilder();
        for (Map.Entry<?, ?> entry : map.entrySet()) {
            Object key = entry.getKey();
            if (key != null) {
                String strValueOf = String.valueOf(key);
                if (!TextUtils.isEmpty(strValueOf) && (valueBuilderOrNull = toValueBuilderOrNull(entry.getValue())) != null) {
                    builderNewBuilder.putFields(strValueOf, valueBuilderOrNull.build());
                }
            }
        }
        return builderNewBuilder;
    }

    public static Value.Builder toValueBuilderOrNull(Object obj) {
        Struct.Builder structBuilderOrNull;
        if (obj == null) {
            return null;
        }
        if (obj instanceof Value) {
            return ((Value) obj).toBuilder();
        }
        if (obj instanceof Value.Builder) {
            return (Value.Builder) obj;
        }
        if (obj instanceof String) {
            return Value.newBuilder().setStringValue((String) obj);
        }
        if (obj instanceof Number) {
            return Value.newBuilder().setNumberValue(((Number) obj).doubleValue());
        }
        if (obj instanceof Boolean) {
            return Value.newBuilder().setBoolValue(((Boolean) obj).booleanValue());
        }
        if (obj instanceof List) {
            ListValue.Builder listValueBuilderOrNull = toListValueBuilderOrNull((List) obj);
            if (listValueBuilderOrNull != null) {
                return Value.newBuilder().setListValue(listValueBuilderOrNull);
            }
        } else if ((obj instanceof Map) && (structBuilderOrNull = toStructBuilderOrNull((Map) obj)) != null) {
            return Value.newBuilder().setStructValue(structBuilderOrNull);
        }
        return null;
    }

    public static Value toValueOrNull(Object obj) {
        if (obj == null) {
            return null;
        }
        if (obj instanceof Value) {
            return (Value) obj;
        }
        if (obj instanceof Value.Builder) {
            return ((Value.Builder) obj).build();
        }
        Value.Builder valueBuilderOrNull = toValueBuilderOrNull(obj);
        if (valueBuilderOrNull != null) {
            return valueBuilderOrNull.build();
        }
        return null;
    }

    public static boolean isEmpty(ListValue listValue) {
        return listValue == null || listValue.getValuesCount() <= 0;
    }
}
