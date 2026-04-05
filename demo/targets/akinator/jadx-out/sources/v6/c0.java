package v6;

import androidx.lifecycle.l1;
import java.util.List;
import kotlinx.coroutines.flow.Flow;
import n6.x0;
import v6.b0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public interface c0 {
    int countNonFinishedContentUriTriggerWorkers();

    void delete(String str);

    List<b0> getAllEligibleWorkSpecsForScheduling(int i10);

    List<String> getAllUnfinishedWork();

    List<String> getAllWorkSpecIds();

    l1 getAllWorkSpecIdsLiveData();

    List<b0> getEligibleWorkForScheduling(int i10);

    List<b0> getEligibleWorkForSchedulingWithContentUris();

    List<androidx.work.b> getInputsFromPrerequisites(String str);

    List<b0> getRecentlyCompletedWork(long j10);

    List<b0> getRunningWork();

    l1 getScheduleRequestedAtLiveData(String str);

    List<b0> getScheduledWork();

    x0 getState(String str);

    List<String> getUnfinishedWorkWithName(String str);

    List<String> getUnfinishedWorkWithTag(String str);

    b0 getWorkSpec(String str);

    List<b0.b> getWorkSpecIdAndStatesForName(String str);

    Flow<List<b0.c>> getWorkStatusPojoFlowDataForIds(List<String> list);

    Flow<List<b0.c>> getWorkStatusPojoFlowForName(String str);

    Flow<List<b0.c>> getWorkStatusPojoFlowForTag(String str);

    b0.c getWorkStatusPojoForId(String str);

    List<b0.c> getWorkStatusPojoForIds(List<String> list);

    List<b0.c> getWorkStatusPojoForName(String str);

    List<b0.c> getWorkStatusPojoForTag(String str);

    l1 getWorkStatusPojoLiveDataForIds(List<String> list);

    l1 getWorkStatusPojoLiveDataForName(String str);

    l1 getWorkStatusPojoLiveDataForTag(String str);

    Flow<Boolean> hasUnfinishedWorkFlow();

    void incrementGeneration(String str);

    void incrementPeriodCount(String str);

    int incrementWorkSpecRunAttemptCount(String str);

    void insertWorkSpec(b0 b0Var);

    int markWorkSpecScheduled(String str, long j10);

    void pruneFinishedWorkWithZeroDependentsIgnoringKeepForAtLeast();

    int resetScheduledState();

    void resetWorkSpecNextScheduleTimeOverride(String str, int i10);

    int resetWorkSpecRunAttemptCount(String str);

    int setCancelledState(String str);

    void setLastEnqueueTime(String str, long j10);

    void setNextScheduleTimeOverride(String str, long j10);

    void setOutput(String str, androidx.work.b bVar);

    int setState(x0 x0Var, String str);

    void setStopReason(String str, int i10);

    void updateWorkSpec(b0 b0Var);
}
