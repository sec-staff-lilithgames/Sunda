package com.unity3d.services.core.device.reader;

import com.unity3d.services.core.device.Storage;
import com.unity3d.services.core.device.StorageManager;
import com.unity3d.services.core.properties.ClientProperties;
import java.util.UUID;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public class GameSessionIdReader implements IGameSessionIdReader {
    private static final int GAME_SESSION_ID_LENGTH = 12;
    private static volatile GameSessionIdReader _instance;
    private Long gameSessionId;

    private GameSessionIdReader() {
    }

    private void generate() {
        UUID uuidRandomUUID = UUID.randomUUID();
        this.gameSessionId = Long.valueOf((Long.toString(uuidRandomUUID.getMostSignificantBits()) + Long.toString(uuidRandomUUID.getLeastSignificantBits())).replace("-", "").substring(0, 12));
    }

    public static GameSessionIdReader getInstance() {
        if (_instance == null) {
            synchronized (GameSessionIdReader.class) {
                try {
                    if (_instance == null) {
                        _instance = new GameSessionIdReader();
                    }
                } finally {
                }
            }
        }
        return _instance;
    }

    private void store() {
        Storage storage;
        if (!StorageManager.init(ClientProperties.getApplicationContext()) || (storage = StorageManager.getStorage(StorageManager.StorageType.PRIVATE)) == null) {
            return;
        }
        storage.set(JsonStorageKeyNames.GAME_SESSION_ID_NORMALIZED_KEY, this.gameSessionId);
        storage.writeStorage();
    }

    @Override // com.unity3d.services.core.device.reader.IGameSessionIdReader
    public synchronized Long getGameSessionId() {
        try {
            if (this.gameSessionId == null) {
                generate();
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return this.gameSessionId;
    }

    @Override // com.unity3d.services.core.device.reader.IGameSessionIdReader
    public synchronized Long getGameSessionIdAndStore() {
        try {
            if (this.gameSessionId == null) {
                generate();
                store();
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return this.gameSessionId;
    }
}
