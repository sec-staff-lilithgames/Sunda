package es;

import java.util.List;
import java.util.Map;
import wr.b3;
import wr.h3;
import wr.j3;
import wr.m6;
import wr.o4;
import xr.cf;
import xr.ie;
import xr.je;
import xr.ke;
import xr.o6;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class l0 extends h3 {
    public static o4 a(Map map) {
        Long stringAsDuration = o6.getStringAsDuration(map, "interval");
        Long stringAsDuration2 = o6.getStringAsDuration(map, "baseEjectionTime");
        Long stringAsDuration3 = o6.getStringAsDuration(map, "maxEjectionTime");
        Integer numberAsInteger = o6.getNumberAsInteger(map, "maxEjectionPercentage");
        w wVar = new w();
        if (stringAsDuration != null) {
            wVar.setIntervalNanos(stringAsDuration);
        }
        if (stringAsDuration2 != null) {
            wVar.setBaseEjectionTimeNanos(stringAsDuration2);
        }
        if (stringAsDuration3 != null) {
            wVar.setMaxEjectionTimeNanos(stringAsDuration3);
        }
        if (numberAsInteger != null) {
            wVar.setMaxEjectionPercent(numberAsInteger);
        }
        Map<String, ?> object = o6.getObject(map, "successRateEjection");
        if (object != null) {
            z zVar = new z();
            Integer numberAsInteger2 = o6.getNumberAsInteger(object, "stdevFactor");
            Integer numberAsInteger3 = o6.getNumberAsInteger(object, "enforcementPercentage");
            Integer numberAsInteger4 = o6.getNumberAsInteger(object, "minimumHosts");
            Integer numberAsInteger5 = o6.getNumberAsInteger(object, "requestVolume");
            if (numberAsInteger2 != null) {
                zVar.setStdevFactor(numberAsInteger2);
            }
            if (numberAsInteger3 != null) {
                zVar.setEnforcementPercentage(numberAsInteger3);
            }
            if (numberAsInteger4 != null) {
                zVar.setMinimumHosts(numberAsInteger4);
            }
            if (numberAsInteger5 != null) {
                zVar.setRequestVolume(numberAsInteger5);
            }
            wVar.setSuccessRateEjection(zVar.build());
        }
        Map<String, ?> object2 = o6.getObject(map, "failurePercentageEjection");
        if (object2 != null) {
            x xVar = new x();
            Integer numberAsInteger6 = o6.getNumberAsInteger(object2, "threshold");
            Integer numberAsInteger7 = o6.getNumberAsInteger(object2, "enforcementPercentage");
            Integer numberAsInteger8 = o6.getNumberAsInteger(object2, "minimumHosts");
            Integer numberAsInteger9 = o6.getNumberAsInteger(object2, "requestVolume");
            if (numberAsInteger6 != null) {
                xVar.setThreshold(numberAsInteger6);
            }
            if (numberAsInteger7 != null) {
                xVar.setEnforcementPercentage(numberAsInteger7);
            }
            if (numberAsInteger8 != null) {
                xVar.setMinimumHosts(numberAsInteger8);
            }
            if (numberAsInteger9 != null) {
                xVar.setRequestVolume(numberAsInteger9);
            }
            wVar.setFailurePercentageEjection(xVar.build());
        }
        List<ie> listUnwrapLoadBalancingConfigList = ke.unwrapLoadBalancingConfigList(o6.getListOfObjects(map, "childPolicy"));
        if (listUnwrapLoadBalancingConfigList == null || listUnwrapLoadBalancingConfigList.isEmpty()) {
            return o4.fromError(m6.f91046n.withDescription("No child policy in outlier_detection_experimental LB policy: " + map));
        }
        o4 o4VarSelectLbPolicyFromList = ke.selectLbPolicyFromList(listUnwrapLoadBalancingConfigList, j3.getDefaultRegistry());
        if (o4VarSelectLbPolicyFromList.getError() != null) {
            return o4VarSelectLbPolicyFromList;
        }
        wVar.setChildPolicy((je) o4VarSelectLbPolicyFromList.getConfig());
        return o4.fromConfig(wVar.build());
    }

    @Override // wr.h3
    public String getPolicyName() {
        return "outlier_detection_experimental";
    }

    @Override // wr.h3
    public int getPriority() {
        return 5;
    }

    @Override // wr.h3
    public boolean isAvailable() {
        return true;
    }

    @Override // wr.b3.a
    public b3 newLoadBalancer(b3.c cVar) {
        return new k0(cVar, cf.f92362a);
    }

    @Override // wr.h3
    public o4 parseLoadBalancingPolicyConfig(Map<String, ?> map) {
        try {
            return a(map);
        } catch (RuntimeException e10) {
            return o4.fromError(m6.f91047o.withCause(e10).withDescription("Failed parsing configuration for " + getPolicyName()));
        }
    }
}
