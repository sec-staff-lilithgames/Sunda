package xr;

import java.util.ArrayList;
import java.util.Collections;
import java.util.EnumSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.logging.Level;
import java.util.logging.Logger;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public abstract class ke {
    public static Set a(String str, Map map) {
        wr.j6 j6VarValueOf;
        List<?> list = o6.getList(map, str);
        if (list == null) {
            return null;
        }
        EnumSet enumSetNoneOf = EnumSet.noneOf(wr.j6.class);
        for (Object obj : list) {
            if (obj instanceof Double) {
                Double d10 = (Double) obj;
                int iIntValue = d10.intValue();
                mh.j3.verify(((double) iIntValue) == d10.doubleValue(), "Status code %s is not integral", obj);
                j6VarValueOf = wr.m6.fromCodeValue(iIntValue).getCode();
                mh.j3.verify(j6VarValueOf.value() == d10.intValue(), "Status code %s is not valid", obj);
            } else {
                if (!(obj instanceof String)) {
                    throw new mh.k3("Can not convert status code " + obj + " to Status.Code, because its type is " + obj.getClass());
                }
                try {
                    j6VarValueOf = wr.j6.valueOf((String) obj);
                } catch (IllegalArgumentException e10) {
                    throw new mh.k3(j1.o2.k(obj, "Status code ", " is not valid"), e10);
                }
            }
            enumSetNoneOf.add(j6VarValueOf);
        }
        return Collections.unmodifiableSet(enumSetNoneOf);
    }

    public static Map<String, ?> getHealthCheckedService(Map<String, ?> map) {
        if (map == null) {
            return null;
        }
        return o6.getObject(map, "healthCheckConfig");
    }

    public static String getHealthCheckedServiceName(Map<String, ?> map) {
        if (map == null) {
            return null;
        }
        return o6.getString(map, "serviceName");
    }

    public static List<Map<String, ?>> getLoadBalancingConfigsFromServiceConfig(Map<String, ?> map) {
        String string;
        ArrayList arrayList = new ArrayList();
        if (map.containsKey("loadBalancingConfig")) {
            arrayList.addAll(o6.getListOfObjects(map, "loadBalancingConfig"));
        }
        if (arrayList.isEmpty() && (string = o6.getString(map, "loadBalancingPolicy")) != null) {
            arrayList.add(Collections.singletonMap(string.toLowerCase(Locale.ROOT), Collections.EMPTY_MAP));
        }
        return Collections.unmodifiableList(arrayList);
    }

    public static wr.o4 selectLbPolicyFromList(List<ie> list, wr.j3 j3Var) {
        ArrayList arrayList = new ArrayList();
        for (ie ieVar : list) {
            String policyName = ieVar.getPolicyName();
            wr.h3 provider = j3Var.getProvider(policyName);
            if (provider != null) {
                if (!arrayList.isEmpty()) {
                    Logger.getLogger(ke.class.getName()).log(Level.FINEST, "{0} specified by Service Config are not available", arrayList);
                }
                wr.o4 loadBalancingPolicyConfig = provider.parseLoadBalancingPolicyConfig(ieVar.getRawConfigValue());
                return loadBalancingPolicyConfig.getError() != null ? loadBalancingPolicyConfig : wr.o4.fromConfig(new je(provider, loadBalancingPolicyConfig.getConfig()));
            }
            arrayList.add(policyName);
        }
        return wr.o4.fromError(wr.m6.f91039g.withDescription("None of " + arrayList + " specified by Service Config are available."));
    }

    public static ie unwrapLoadBalancingConfig(Map<String, ?> map) {
        if (map.size() == 1) {
            String key = map.entrySet().iterator().next().getKey();
            return new ie(key, o6.getObject(map, key));
        }
        throw new RuntimeException("There are " + map.size() + " fields in a LoadBalancingConfig object. Exactly one is expected. Config=" + map);
    }

    public static List<ie> unwrapLoadBalancingConfigList(List<Map<String, ?>> list) {
        if (list == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        Iterator<Map<String, ?>> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(unwrapLoadBalancingConfig(it.next()));
        }
        return Collections.unmodifiableList(arrayList);
    }
}
