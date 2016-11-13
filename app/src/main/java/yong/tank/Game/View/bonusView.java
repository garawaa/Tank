package yong.tank.Game.View;

import android.content.Context;

import yong.tank.Dto.GameDto;
import yong.tank.Game.thread.BonusThread;

/**
 * Created by jiangyong_tong on 2016/10/31.
 */

public class BonusView extends ViewBase{

    private BonusThread bonusThread;
    private static String TAG = "BonusView";

    public BonusView(Context context) {
        super(context);
    }

    public BonusView(Context context, GameDto gameDto) {
        super(context, gameDto);
    }

    @Override
    void initThread() {
        this.bonusThread = new BonusThread(this.gameDto,this.holder);
        new Thread(this.bonusThread).start();
    }

    @Override
    void stopThread() {
        this.bonusThread.stopThread();
    }


}