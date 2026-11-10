

const Bike = require('../src/bike.js'); 

describe('Bike', () => {
  test('isTherePowerTest', () => {
    const bike = new Bike();
    expect(bike.powerChecker()).toBe(true);
  });

  test('acceleratorTest', () => {
    const bike = new Bike();
    const gear = bike.gearSystem(15);
    const speed = bike.acceleratorRate(gear, 15);
    expect(speed).toBe(19);
  });

  test('speedLimiterTest', () => {
    const bike = new Bike();
    const speed = bike.speedLimiter(35);
    expect(speed).toBe(30);

    const speed2 = bike.speedLimiter(25);
    expect(speed2).toBe(25);
  });

  test('gearcheckerTest', () => {
    const bike = new Bike();
    const gear1 = bike.gearSystem(5);
    expect(gear1).toBe(1);

    const gear2 = bike.gearSystem(15);
    expect(gear2).toBe(2);

    const gear3 = bike.gearSystem(25);
    expect(gear3).toBe(3);
  });
});

