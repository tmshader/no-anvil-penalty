# No Anvil Penalty / No Repair Cost
Removes the prior-work / repair penalty from anvils so combining and repairing gear does not keep getting more expensive.

[![Modrinth](https://img.shields.io/modrinth/dt/jahus-no-anvil-penalty-updated?logo=modrinth&label=Modrinth)](https://modrinth.com/datapack/jahus-no-anvil-penalty-updated)
[![CurseForge](https://img.shields.io/curseforge/dt/1759955?logo=curseforge&label=CurseForge)](https://www.curseforge.com/projects/1759955)

Install it and it works. No config.

## Fork notice
This is a maintained **fork** of [TMShader/no-anvil-penalty](https://github.com/tmshader/no-anvil-penalty) for **Minecraft 26.3**.

The upstream project does not currently ship a 26.3 build. This fork updates the mod for the unobfuscated 26.x toolchain while keeping the same behaviour: anvil prior-work cost growth is forced to zero.
- [Original author: TMShader](https://github.com/tmshader)
- [Original repository](https://github.com/tmshader/no-anvil-penalty)
- [Original mod on Modrinth](https://modrinth.com/mod/no-anvil-penalty)

If upstream resumes maintenance and merges 26.3 support, prefer the official release.

## What it does
Vanilla anvils increase the "prior work" penalty each time an item is worked. Costs climb until the anvil refuses the operation ("Too Expensive!") or the required levels atteign an absurd value.

This mod zeroes that escalation. Base repair and enchantment costs still apply; only the cumulative penalty is removed.

## Supported versions
- Minecraft **26.3** (Fabric)
- Fabric Loader **≥ 0.19.5**

No Fabric API required.

## License
Apache License 2.0, same as upstream.
