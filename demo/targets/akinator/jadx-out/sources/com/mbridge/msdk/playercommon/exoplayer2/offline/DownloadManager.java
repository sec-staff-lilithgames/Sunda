package com.mbridge.msdk.playercommon.exoplayer2.offline;

import android.os.ConditionVariable;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.util.Log;
import bp.oM.DwaEpyvxz;
import com.bytedance.sdk.openadsdk.component.zz.Qnp.PtLatqAYjEFT;
import com.mbridge.msdk.playercommon.exoplayer2.offline.DownloadAction;
import com.mbridge.msdk.playercommon.exoplayer2.upstream.DataSource;
import com.mbridge.msdk.playercommon.exoplayer2.upstream.cache.Cache;
import com.mbridge.msdk.playercommon.exoplayer2.util.Assertions;
import com.mbridge.msdk.playercommon.exoplayer2.util.Util;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.IOException;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public final class DownloadManager {
    private static final boolean DEBUG = false;
    public static final int DEFAULT_MAX_SIMULTANEOUS_DOWNLOADS = 1;
    public static final int DEFAULT_MIN_RETRY_COUNT = 5;
    private static final String TAG = "DownloadManager";
    private final ActionFile actionFile;
    private final ArrayList<Task> activeDownloadTasks;
    private final DownloadAction.Deserializer[] deserializers;
    private final DownloaderConstructorHelper downloaderConstructorHelper;
    private boolean downloadsStopped;
    private final Handler fileIOHandler;
    private final HandlerThread fileIOThread;
    private final Handler handler;
    private boolean initialized;
    private final CopyOnWriteArraySet<Listener> listeners;
    private final int maxActiveDownloadTasks;
    private final int minRetryCount;
    private int nextTaskId;
    private boolean released;
    private final ArrayList<Task> tasks;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public interface Listener {
        void onIdle(DownloadManager downloadManager);

        void onInitialized(DownloadManager downloadManager);

        void onTaskStateChanged(DownloadManager downloadManager, TaskState taskState);
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class Task implements Runnable {
        public static final int STATE_QUEUED_CANCELING = 5;
        public static final int STATE_STARTED_CANCELING = 6;
        public static final int STATE_STARTED_STOPPING = 7;
        private final DownloadAction action;
        private volatile int currentState;
        private final DownloadManager downloadManager;
        private volatile Downloader downloader;
        private Throwable error;

        /* renamed from: id, reason: collision with root package name */
        private final int f42167id;
        private final int minRetryCount;
        private Thread thread;

        /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
        @Retention(RetentionPolicy.SOURCE)
        public @interface InternalState {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public boolean canStart() {
            return this.currentState == 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void cancel() {
            if (changeStateAndNotify(0, 5)) {
                this.downloadManager.handler.post(new Runnable() { // from class: com.mbridge.msdk.playercommon.exoplayer2.offline.DownloadManager.Task.1
                    @Override // java.lang.Runnable
                    public void run() {
                        Task.this.changeStateAndNotify(5, 3);
                    }
                });
            } else if (changeStateAndNotify(1, 6)) {
                cancelDownload();
            }
        }

        private void cancelDownload() {
            if (this.downloader != null) {
                this.downloader.cancel();
            }
            this.thread.interrupt();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public boolean changeStateAndNotify(int i10, int i11) {
            return changeStateAndNotify(i10, i11, null);
        }

        private int getExternalState() {
            int i10 = this.currentState;
            if (i10 == 5) {
                return 0;
            }
            if (i10 == 6 || i10 == 7) {
                return 1;
            }
            return this.currentState;
        }

        private int getRetryDelayMillis(int i10) {
            return Math.min((i10 - 1) * 1000, 5000);
        }

        private String getStateString() {
            int i10 = this.currentState;
            return (i10 == 5 || i10 == 6) ? "CANCELING" : i10 != 7 ? TaskState.getStateString(this.currentState) : "STOPPING";
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void start() {
            if (changeStateAndNotify(0, 1)) {
                Thread thread = new Thread(this);
                this.thread = thread;
                thread.start();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void stop() {
            if (changeStateAndNotify(1, 7)) {
                DownloadManager.logd("Stopping", this);
                this.thread.interrupt();
            }
        }

        public float getDownloadPercentage() {
            if (this.downloader != null) {
                return this.downloader.getDownloadPercentage();
            }
            return -1.0f;
        }

        public TaskState getDownloadState() {
            return new TaskState(this.f42167id, this.action, getExternalState(), getDownloadPercentage(), getDownloadedBytes(), this.error);
        }

        public long getDownloadedBytes() {
            if (this.downloader != null) {
                return this.downloader.getDownloadedBytes();
            }
            return 0L;
        }

        public boolean isActive() {
            return this.currentState == 5 || this.currentState == 1 || this.currentState == 7 || this.currentState == 6;
        }

        public boolean isFinished() {
            return this.currentState == 4 || this.currentState == 2 || this.currentState == 3;
        }

        @Override // java.lang.Runnable
        public void run() {
            DownloadManager.logd("Task is started", this);
            try {
                this.downloader = this.action.createDownloader(this.downloadManager.downloaderConstructorHelper);
                if (this.action.isRemoveAction) {
                    this.downloader.remove();
                } else {
                    long j10 = -1;
                    int i10 = 0;
                    while (!Thread.interrupted()) {
                        try {
                            this.downloader.download();
                            break;
                        } catch (IOException e10) {
                            long downloadedBytes = this.downloader.getDownloadedBytes();
                            if (downloadedBytes != j10) {
                                DownloadManager.logd("Reset error count. downloadedBytes = " + downloadedBytes, this);
                                i10 = 0;
                                j10 = downloadedBytes;
                            }
                            if (this.currentState != 1 || (i10 = i10 + 1) > this.minRetryCount) {
                                throw e10;
                            }
                            DownloadManager.logd("Download error. Retry " + i10, this);
                            Thread.sleep((long) getRetryDelayMillis(i10));
                        }
                    }
                }
                th = null;
            } catch (Throwable th2) {
                th = th2;
            }
            this.downloadManager.handler.post(new Runnable() { // from class: com.mbridge.msdk.playercommon.exoplayer2.offline.DownloadManager.Task.2
                @Override // java.lang.Runnable
                public void run() {
                    Task task = Task.this;
                    Throwable th3 = th;
                    if (!task.changeStateAndNotify(1, th3 != null ? 4 : 2, th3) && !Task.this.changeStateAndNotify(6, 3) && !Task.this.changeStateAndNotify(7, 0)) {
                        throw new IllegalStateException();
                    }
                }
            });
        }

        public String toString() {
            return super.toString();
        }

        private Task(int i10, DownloadManager downloadManager, DownloadAction downloadAction, int i11) {
            this.f42167id = i10;
            this.downloadManager = downloadManager;
            this.action = downloadAction;
            this.currentState = 0;
            this.minRetryCount = i11;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public boolean changeStateAndNotify(int i10, int i11, Throwable th2) {
            if (this.currentState != i10) {
                return false;
            }
            this.currentState = i11;
            this.error = th2;
            if (this.currentState != getExternalState()) {
                return true;
            }
            this.downloadManager.onTaskStateChange(this);
            return true;
        }

        private static String toString(byte[] bArr) {
            if (bArr.length > 100) {
                return "<data is too long>";
            }
            return "'" + Util.fromUtf8Bytes(bArr) + '\'';
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class TaskState {
        public static final int STATE_CANCELED = 3;
        public static final int STATE_COMPLETED = 2;
        public static final int STATE_FAILED = 4;
        public static final int STATE_QUEUED = 0;
        public static final int STATE_STARTED = 1;
        public final DownloadAction action;
        public final float downloadPercentage;
        public final long downloadedBytes;
        public final Throwable error;
        public final int state;
        public final int taskId;

        /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
        @Retention(RetentionPolicy.SOURCE)
        public @interface State {
        }

        private TaskState(int i10, DownloadAction downloadAction, int i11, float f10, long j10, Throwable th2) {
            this.taskId = i10;
            this.action = downloadAction;
            this.state = i11;
            this.downloadPercentage = f10;
            this.downloadedBytes = j10;
            this.error = th2;
        }

        public static String getStateString(int i10) {
            if (i10 == 0) {
                return "QUEUED";
            }
            if (i10 == 1) {
                return PtLatqAYjEFT.JIRMAVVbbuk;
            }
            if (i10 == 2) {
                return DwaEpyvxz.NIUxAgHAevywFTM;
            }
            if (i10 == 3) {
                return "CANCELED";
            }
            if (i10 == 4) {
                return "FAILED";
            }
            throw new IllegalStateException();
        }
    }

    public DownloadManager(Cache cache, DataSource.Factory factory, File file, DownloadAction.Deserializer... deserializerArr) {
        this(new DownloaderConstructorHelper(cache, factory), file, deserializerArr);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Task addTaskForAction(DownloadAction downloadAction) {
        int i10 = this.nextTaskId;
        this.nextTaskId = i10 + 1;
        Task task = new Task(i10, this, downloadAction, this.minRetryCount);
        this.tasks.add(task);
        logd("Task is added", task);
        return task;
    }

    private void loadActions() {
        this.fileIOHandler.post(new Runnable() { // from class: com.mbridge.msdk.playercommon.exoplayer2.offline.DownloadManager.2
            @Override // java.lang.Runnable
            public void run() {
                final DownloadAction[] downloadActionArrLoad;
                try {
                    downloadActionArrLoad = DownloadManager.this.actionFile.load(DownloadManager.this.deserializers);
                    DownloadManager.logd("Action file is loaded.");
                } catch (Throwable th2) {
                    Log.e(DownloadManager.TAG, "Action file loading failed.", th2);
                    downloadActionArrLoad = new DownloadAction[0];
                }
                DownloadManager.this.handler.post(new Runnable() { // from class: com.mbridge.msdk.playercommon.exoplayer2.offline.DownloadManager.2.1
                    @Override // java.lang.Runnable
                    public void run() {
                        if (DownloadManager.this.released) {
                            return;
                        }
                        ArrayList arrayList = new ArrayList(DownloadManager.this.tasks);
                        DownloadManager.this.tasks.clear();
                        for (DownloadAction downloadAction : downloadActionArrLoad) {
                            DownloadManager.this.addTaskForAction(downloadAction);
                        }
                        DownloadManager.logd("Tasks are created.");
                        DownloadManager.this.initialized = true;
                        Iterator it = DownloadManager.this.listeners.iterator();
                        while (it.hasNext()) {
                            ((Listener) it.next()).onInitialized(DownloadManager.this);
                        }
                        if (!arrayList.isEmpty()) {
                            DownloadManager.this.tasks.addAll(arrayList);
                            DownloadManager.this.saveActions();
                        }
                        DownloadManager.this.maybeStartTasks();
                        for (int i10 = 0; i10 < DownloadManager.this.tasks.size(); i10++) {
                            Task task = (Task) DownloadManager.this.tasks.get(i10);
                            if (task.currentState == 0) {
                                DownloadManager.this.notifyListenersTaskStateChange(task);
                            }
                        }
                    }
                });
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void logd(String str) {
    }

    private void maybeNotifyListenersIdle() {
        if (isIdle()) {
            logd("Notify idle state");
            Iterator<Listener> it = this.listeners.iterator();
            while (it.hasNext()) {
                it.next().onIdle(this);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void maybeStartTasks() {
        DownloadAction downloadAction;
        boolean z10;
        if (!this.initialized || this.released) {
            return;
        }
        boolean z11 = this.downloadsStopped || this.activeDownloadTasks.size() == this.maxActiveDownloadTasks;
        for (int i10 = 0; i10 < this.tasks.size(); i10++) {
            Task task = this.tasks.get(i10);
            if (task.canStart() && ((z10 = (downloadAction = task.action).isRemoveAction) || !z11)) {
                boolean z12 = true;
                int i11 = 0;
                while (true) {
                    if (i11 >= i10) {
                        break;
                    }
                    Task task2 = this.tasks.get(i11);
                    if (task2.action.isSameMedia(downloadAction)) {
                        if (!z10) {
                            if (task2.action.isRemoveAction) {
                                z11 = true;
                                z12 = false;
                                break;
                            }
                        } else {
                            logd(task + " clashes with " + task2);
                            task2.cancel();
                            z12 = false;
                        }
                    }
                    i11++;
                }
                if (z12) {
                    task.start();
                    if (!z10) {
                        this.activeDownloadTasks.add(task);
                        z11 = this.activeDownloadTasks.size() == this.maxActiveDownloadTasks;
                    }
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void notifyListenersTaskStateChange(Task task) {
        logd("Task state is changed", task);
        TaskState downloadState = task.getDownloadState();
        Iterator<Listener> it = this.listeners.iterator();
        while (it.hasNext()) {
            it.next().onTaskStateChanged(this, downloadState);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void onTaskStateChange(Task task) {
        if (this.released) {
            return;
        }
        boolean zIsActive = task.isActive();
        if (!zIsActive) {
            this.activeDownloadTasks.remove(task);
        }
        notifyListenersTaskStateChange(task);
        if (task.isFinished()) {
            this.tasks.remove(task);
            saveActions();
        }
        if (zIsActive) {
            return;
        }
        maybeStartTasks();
        maybeNotifyListenersIdle();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void saveActions() {
        if (this.released) {
            return;
        }
        final DownloadAction[] downloadActionArr = new DownloadAction[this.tasks.size()];
        for (int i10 = 0; i10 < this.tasks.size(); i10++) {
            downloadActionArr[i10] = this.tasks.get(i10).action;
        }
        this.fileIOHandler.post(new Runnable() { // from class: com.mbridge.msdk.playercommon.exoplayer2.offline.DownloadManager.3
            @Override // java.lang.Runnable
            public void run() throws Throwable {
                try {
                    DownloadManager.this.actionFile.store(downloadActionArr);
                    DownloadManager.logd("Actions persisted.");
                } catch (IOException e10) {
                    Log.e(DownloadManager.TAG, "Persisting actions failed.", e10);
                }
            }
        });
    }

    public void addListener(Listener listener) {
        this.listeners.add(listener);
    }

    public TaskState[] getAllTaskStates() {
        Assertions.checkState(!this.released);
        int size = this.tasks.size();
        TaskState[] taskStateArr = new TaskState[size];
        for (int i10 = 0; i10 < size; i10++) {
            taskStateArr[i10] = this.tasks.get(i10).getDownloadState();
        }
        return taskStateArr;
    }

    public int getDownloadCount() {
        int i10 = 0;
        for (int i11 = 0; i11 < this.tasks.size(); i11++) {
            if (!this.tasks.get(i11).action.isRemoveAction) {
                i10++;
            }
        }
        return i10;
    }

    public int getTaskCount() {
        Assertions.checkState(!this.released);
        return this.tasks.size();
    }

    public TaskState getTaskState(int i10) {
        Assertions.checkState(!this.released);
        for (int i11 = 0; i11 < this.tasks.size(); i11++) {
            Task task = this.tasks.get(i11);
            if (task.f42167id == i10) {
                return task.getDownloadState();
            }
        }
        return null;
    }

    public int handleAction(byte[] bArr) throws IOException {
        Assertions.checkState(!this.released);
        return handleAction(DownloadAction.deserializeFromStream(this.deserializers, new ByteArrayInputStream(bArr)));
    }

    public boolean isIdle() {
        Assertions.checkState(!this.released);
        if (!this.initialized) {
            return false;
        }
        for (int i10 = 0; i10 < this.tasks.size(); i10++) {
            if (this.tasks.get(i10).isActive()) {
                return false;
            }
        }
        return true;
    }

    public boolean isInitialized() {
        Assertions.checkState(!this.released);
        return this.initialized;
    }

    public void release() {
        if (this.released) {
            return;
        }
        this.released = true;
        for (int i10 = 0; i10 < this.tasks.size(); i10++) {
            this.tasks.get(i10).stop();
        }
        final ConditionVariable conditionVariable = new ConditionVariable();
        this.fileIOHandler.post(new Runnable() { // from class: com.mbridge.msdk.playercommon.exoplayer2.offline.DownloadManager.1
            @Override // java.lang.Runnable
            public void run() {
                conditionVariable.open();
            }
        });
        conditionVariable.block();
        this.fileIOThread.quit();
        logd("Released");
    }

    public void removeListener(Listener listener) {
        this.listeners.remove(listener);
    }

    public void startDownloads() {
        Assertions.checkState(!this.released);
        if (this.downloadsStopped) {
            this.downloadsStopped = false;
            maybeStartTasks();
            logd("Downloads are started");
        }
    }

    public void stopDownloads() {
        Assertions.checkState(!this.released);
        if (this.downloadsStopped) {
            return;
        }
        this.downloadsStopped = true;
        for (int i10 = 0; i10 < this.activeDownloadTasks.size(); i10++) {
            this.activeDownloadTasks.get(i10).stop();
        }
        logd("Downloads are stopping");
    }

    public DownloadManager(DownloaderConstructorHelper downloaderConstructorHelper, File file, DownloadAction.Deserializer... deserializerArr) {
        this(downloaderConstructorHelper, 1, 5, file, deserializerArr);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void logd(String str, Task task) {
        logd(str + ": " + task);
    }

    public DownloadManager(DownloaderConstructorHelper downloaderConstructorHelper, int i10, int i11, File file, DownloadAction.Deserializer... deserializerArr) {
        Assertions.checkArgument(deserializerArr.length > 0, "At least one Deserializer is required.");
        this.downloaderConstructorHelper = downloaderConstructorHelper;
        this.maxActiveDownloadTasks = i10;
        this.minRetryCount = i11;
        this.actionFile = new ActionFile(file);
        this.deserializers = deserializerArr;
        this.downloadsStopped = true;
        this.tasks = new ArrayList<>();
        this.activeDownloadTasks = new ArrayList<>();
        Looper looperMyLooper = Looper.myLooper();
        this.handler = new Handler(looperMyLooper == null ? Looper.getMainLooper() : looperMyLooper);
        HandlerThread handlerThread = new HandlerThread("DownloadManager file i/o");
        this.fileIOThread = handlerThread;
        handlerThread.start();
        this.fileIOHandler = new Handler(handlerThread.getLooper());
        this.listeners = new CopyOnWriteArraySet<>();
        loadActions();
        logd("Created");
    }

    public int handleAction(DownloadAction downloadAction) {
        Assertions.checkState(!this.released);
        Task taskAddTaskForAction = addTaskForAction(downloadAction);
        if (this.initialized) {
            saveActions();
            maybeStartTasks();
            if (taskAddTaskForAction.currentState == 0) {
                notifyListenersTaskStateChange(taskAddTaskForAction);
            }
        }
        return taskAddTaskForAction.f42167id;
    }
}
