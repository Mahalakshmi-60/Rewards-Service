import org.example.Service.RewardsService;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RewardServiceTest {


    private RewardsService rewardService;



    @Test
    void testCalculatePoints() {
        // Directly testing the reward calculation logic
        assertEquals(90, rewardService.CalculatePoints(120)); // 2x20 + 1x50
        assertEquals(25, rewardService.CalculatePoints(75));  // 1x25
        assertEquals(0, rewardService.CalculatePoints(50));   // no points
        assertEquals(0, rewardService.CalculatePoints(30));   // no points
        assertEquals(250, rewardService.CalculatePoints(200)); // 2x100 + 1x50
    }




}

